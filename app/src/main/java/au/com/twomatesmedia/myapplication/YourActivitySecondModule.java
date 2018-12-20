package au.com.twomatesmedia.myapplication;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        YourActivitySubcomponentSecond.class})
abstract class YourActivitySecondModule {


    @Binds
    @IntoMap
    @ClassKey(DaggerTestSecondActivity.class)
    abstract AndroidInjector.Factory<?> bindYourActivityInjectorFactorySecond(YourActivitySubcomponentSecond.Builder builder);

}
