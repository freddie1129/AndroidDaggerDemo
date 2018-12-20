package au.com.twomatesmedia.myapplication;

import dagger.MapKey;

@MapKey
@interface MyEnumKey {
    MyEnum value();
}
