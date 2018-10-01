package jcrystal.reflection.annotations.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface EmailValidation {
	String value() default "";
}