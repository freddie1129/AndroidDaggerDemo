package au.com.twomatesmedia.myapplication;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = YourFragmentSubcomponent.class)
abstract class YourFragmentModule {
    @Binds
    @IntoMap
    @ClassKey(DaggerItemFragment.class)
    abstract AndroidInjector.Factory<?> bindYourFragmentInjectorFactory(YourFragmentSubcomponent.Builder builder);
}
