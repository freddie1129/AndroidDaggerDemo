package au.com.twomatesmedia.myapplication;

import android.app.Application;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class MyApplication extends Application {

    private MyComponent myComponent;

    @Override
    public void onCreate() {
        myComponent = DaggerMyComponent.builder().build();
        super.onCreate();

    }

    public MyComponent getMyComponent() {
        return myComponent;
    }
}
