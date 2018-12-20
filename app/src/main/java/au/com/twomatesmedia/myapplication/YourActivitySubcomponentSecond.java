package au.com.twomatesmedia.myapplication;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface YourActivitySubcomponentSecond extends AndroidInjector<DaggerTestSecondActivity> {
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<DaggerTestSecondActivity> {}
}
