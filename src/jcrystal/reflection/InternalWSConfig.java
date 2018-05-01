package jcrystal.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import jcrystal.DefaultInternalConfig;

@Retention(RetentionPolicy.RUNTIME)
public @interface InternalWSConfig {
	Class<?> value() default DefaultInternalConfig.class;
}
