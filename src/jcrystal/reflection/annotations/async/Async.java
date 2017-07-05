package jcrystal.reflection.annotations.async;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Async {
	String name() default "";
}
