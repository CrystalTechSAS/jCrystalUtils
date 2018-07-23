package jcrystal.reflection.annotations.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MaxValidation {
	String value() default "";
	int max() default 0;
}
