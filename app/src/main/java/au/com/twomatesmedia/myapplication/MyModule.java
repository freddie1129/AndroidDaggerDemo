package au.com.twomatesmedia.myapplication;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

@Module
public class MyModule {
    @Provides
    public static Book provide_Book()
    {
        return new Book("The Great GateBe");
    }

    @Provides
    @Singleton
    public static ItemFragment provide_itemFragment()
    {
        return ItemFragment.newInstance(1);
    }

    @Provides
    @IntoSet
    static String provideOneString()
    {
        return "ABC";
    }

    @Provides
    @IntoSet
    static String provideTwoString()
    {
        return "YOUR ARE MY.";
    }

    @Provides
    @ElementsIntoSet
    static Set<String> provideSomeString()
    {
        return new HashSet<String>(Arrays.asList("DEF","GHI"));
    }

    @Provides
    @IntoMap
    @StringKey("foo")
    static Long ProvideFooValue(){
        return 100L;
    }

    @Provides
    @IntoMap
    @ClassKey(Book.class)
    static String provideBookValue(){
        return "value for thing";
    }

    @Provides @IntoMap
    @MyEnumKey(MyEnum.ABC)
    static String provideABCValue() {
        return "value for ABC";
    }

    @Provides @IntoMap
    @MyNumberClassKey(BigDecimal.class)
    static String provideBigDecimalValue() {
        return "value for BigDecimal";
    }

    @Provides @IntoMap
    @MyKey(name = "abc", implementingClass = Book.class, thresholds = {1, 5, 10})
    static String provideAbc1510Value() {
        return "foo";
    }

    /*@Provides
    @IntoSet
    static Map.Entry*/


}
