package au.com.twomatesmedia.myapplication;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        YourSecondActivitySubcomponent.class})
abstract class YourActivitySecondModule {


    @Binds
    @IntoMap
    @ClassKey(DaggerSecondActivity.class)
    abstract AndroidInjector.Factory<?> bindYourActivityInjectorFactorySecond(YourSecondActivitySubcomponent.Builder builder);

}
