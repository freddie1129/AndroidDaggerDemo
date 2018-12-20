package au.com.twomatesmedia.myapplication;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface YourActivitySubcomponent extends AndroidInjector<DaggerTestActivity> {
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<DaggerTestActivity> {}

}
