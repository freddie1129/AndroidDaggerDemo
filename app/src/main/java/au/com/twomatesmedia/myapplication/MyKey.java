package au.com.twomatesmedia.myapplication;

import dagger.MapKey;

@MapKey(unwrapValue = false)
@interface MyKey {
    String name();
    Class<?> implementingClass();
    int[] thresholds();
}

