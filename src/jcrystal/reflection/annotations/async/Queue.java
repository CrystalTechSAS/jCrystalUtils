package jcrystal.reflection.annotations.async;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Queue {
	String name() default "defqueue";
	String rate() default "1/s";
}
