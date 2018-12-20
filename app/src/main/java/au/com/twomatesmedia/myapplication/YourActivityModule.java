package au.com.twomatesmedia.myapplication;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {YourFirstActivitySubcomponent.class, YourSecondActivitySubcomponent.class,

       })
abstract class YourActivityModule {
    @Binds
    @IntoMap
    @ClassKey(DaggerFirstActivity.class)
    abstract AndroidInjector.Factory<?> bindYourActivityInjectorFactory(YourFirstActivitySubcomponent.Builder builder);

    @Binds
    @IntoMap
    @ClassKey(DaggerSecondActivity.class)
    abstract AndroidInjector.Factory<?> bindYourActivityInjectorFactorySecond(YourSecondActivitySubcomponent.Builder builder);

}
