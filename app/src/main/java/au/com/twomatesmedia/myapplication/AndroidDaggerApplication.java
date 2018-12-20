package au.com.twomatesmedia.myapplication;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class AndroidDaggerApplication extends Application implements HasSupportFragmentInjector, HasActivityInjector
        {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

   @Inject
   DispatchingAndroidInjector<Fragment> dispatchingFragmentInjector;



    @Override
    public void onCreate() {
        super.onCreate();
        DaggerMyComponent.create().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }

            @Override
            public AndroidInjector<Fragment> supportFragmentInjector() {
                return dispatchingFragmentInjector;
            }


    /* @Override
            public AndroidInjector<Fragment> supportFragmentInjector() {
                return null;
            }*/

}
