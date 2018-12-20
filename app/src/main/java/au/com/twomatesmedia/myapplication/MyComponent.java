package au.com.twomatesmedia.myapplication;

import java.util.Set;

import javax.inject.Provider;
import javax.inject.Singleton;

import dagger.Component;
import dagger.Lazy;
import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {MyModule.class, AndroidInjectionModule.class,AndroidSupportInjectionModule.class, YourActivityModule.class, YourFragmentModule.class})
@Singleton
public interface MyComponent {
    void inject(MainActivity activity);
    void inject(ItemFragment fragment);
    void inject(AndroidDaggerApplication androidDaggerApplication);


    Book getBook();

    Provider<Book> getSomeTypeProvider();
    Lazy<Book> getLazySomeType();

}
