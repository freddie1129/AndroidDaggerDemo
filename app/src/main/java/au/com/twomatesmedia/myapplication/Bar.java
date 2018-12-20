package au.com.twomatesmedia.myapplication;


import java.util.Set;

import javax.inject.Inject;

import dagger.multibindings.IntoSet;


public class Bar {

    @Inject Bar(Set<String> stringSet)
    {
        assert stringSet.contains("ABC");
        assert stringSet.contains("DEF");
        assert stringSet.contains("GHI");
    }

}
