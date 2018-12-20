package au.com.twomatesmedia.myapplication;

import dagger.Binds;
import dagger.MapKey;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = YourDaggerItemFragmentSubcomponent.class)
abstract class YourFragmentModule {

    @Binds
    @IntoMap
    @ClassKey(DaggerItemFragment.class)
    abstract AndroidInjector.Factory<?> bindYourFragmentInjectorFactory(YourDaggerItemFragmentSubcomponent.Builder builder);
}
