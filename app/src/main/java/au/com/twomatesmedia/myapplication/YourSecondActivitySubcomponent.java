package au.com.twomatesmedia.myapplication;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface YourSecondActivitySubcomponent extends AndroidInjector<DaggerSecondActivity> {
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<DaggerSecondActivity> {}
}
