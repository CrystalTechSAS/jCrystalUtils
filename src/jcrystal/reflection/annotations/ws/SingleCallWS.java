package jcrystal.reflection.annotations.ws;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface SingleCallWS {
	int current() default 0;
}
