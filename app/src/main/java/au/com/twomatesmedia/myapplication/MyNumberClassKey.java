package au.com.twomatesmedia.myapplication;

import dagger.MapKey;

@MapKey
@interface MyNumberClassKey {
    Class<? extends Number> value();
}