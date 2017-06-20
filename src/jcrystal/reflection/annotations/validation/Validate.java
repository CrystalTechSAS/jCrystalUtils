package jcrystal.reflection.annotations.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {
	boolean notEmpty() default false;
	boolean trim() default false;
	int min() default Integer.MIN_VALUE;
	int max() default Integer.MAX_VALUE;
}
