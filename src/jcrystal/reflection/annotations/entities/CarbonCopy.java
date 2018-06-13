package jcrystal.reflection.annotations.entities;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface CarbonCopy {
	Class<?> value();
}
