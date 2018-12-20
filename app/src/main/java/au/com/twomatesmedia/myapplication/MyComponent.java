package au.com.twomatesmedia.myapplication;

import java.util.Map;
import java.util.Set;

import javax.inject.Provider;
import javax.inject.Singleton;

import dagger.Component;
import dagger.Lazy;
import dagger.MapKey;
import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {MyModule.class, AndroidInjectionModule.class,AndroidSupportInjectionModule.class})
@Singleton
public interface MyComponent {
    void inject(MainActivity activity);
    void inject(ItemFragment fragment);


    Book getBook();

    Provider<Book> getSomeTypeProvider();
    Lazy<Book> getLazySomeType();

    Set<String> strings();

    Map<String,Long> longsByString();
    Map<Class<?>,String> stringByClass();

    Map<MyEnum, String> myEnumStringMap();
    Map<Class<? extends Number>, String> stringsByNumberClass();

    Map<MyKey, String> myKeyStringMap();

}
