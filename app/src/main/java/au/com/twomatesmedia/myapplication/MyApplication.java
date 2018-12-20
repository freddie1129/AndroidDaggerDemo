package au.com.twomatesmedia.myapplication;

import android.app.Application;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class MyApplication extends Application {

    private MyComponent myComponent;

    @Override
    public void onCreate() {
        myComponent = DaggerMyComponent.builder().build();
        Set<String> s = myComponent.strings();
        Map<String, Long> stringLongMap = myComponent.longsByString();
        Map<Class<?>, String> classStringMap = myComponent.stringByClass();
        String s1 =  myComponent.myEnumStringMap().get(MyEnum.ABC);
        String s2 =  myComponent.stringsByNumberClass().get(BigDecimal.class);






        super.onCreate();

    }



    public MyComponent getMyComponent() {
        return myComponent;
    }
}
