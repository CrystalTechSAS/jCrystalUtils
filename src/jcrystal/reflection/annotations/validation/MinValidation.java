package jcrystal.reflection.annotations.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MinValidation {
	String value() default "";
	int min() default 0;
}
