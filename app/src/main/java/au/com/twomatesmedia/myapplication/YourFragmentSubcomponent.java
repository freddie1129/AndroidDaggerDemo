package au.com.twomatesmedia.myapplication;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface YourFragmentSubcomponent extends AndroidInjector<DaggerItemFragment> {

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<DaggerItemFragment> {}

}
