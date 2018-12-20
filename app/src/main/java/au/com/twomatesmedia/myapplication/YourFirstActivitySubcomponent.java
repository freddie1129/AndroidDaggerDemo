package au.com.twomatesmedia.myapplication;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface YourFirstActivitySubcomponent extends AndroidInjector<DaggerFirstActivity> {
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<DaggerFirstActivity> {}

}
