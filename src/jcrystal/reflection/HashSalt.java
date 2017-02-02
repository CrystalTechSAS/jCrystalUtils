package jcrystal.reflection;

import jcrystal.datetime.DateType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface HashSalt {
    String value();
}
