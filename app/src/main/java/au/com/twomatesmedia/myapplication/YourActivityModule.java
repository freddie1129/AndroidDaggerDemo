package au.com.twomatesmedia.myapplication;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {YourActivitySubcomponent.class, YourActivitySubcomponentSecond.class,

       })
abstract class YourActivityModule {
    @Binds
    @IntoMap
    @ClassKey(DaggerTestActivity.class)
    abstract AndroidInjector.Factory<?> bindYourActivityInjectorFactory(YourActivitySubcomponent.Builder builder);

    @Binds
    @IntoMap
    @ClassKey(DaggerTestSecondActivity.class)
    abstract AndroidInjector.Factory<?> bindYourActivityInjectorFactorySecond(YourActivitySubcomponentSecond.Builder builder);

   /* @Binds
    @IntoMap
    @ClassKey(DaggerItemFragment.class)
    abstract AndroidInjector.Factory<?> bindYourFragmentInjectorFactory(YourDaggerItemFragmentSubcomponent.Builder builder);
*/

}
