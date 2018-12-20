package au.com.twomatesmedia.myapplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {
    @Provides
    public static Book provide_Book()
    {
        return new Book("The Great GateBe");
    }

}
