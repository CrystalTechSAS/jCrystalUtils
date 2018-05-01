package jcrystal.reflection.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface EntityIndex {
	String name() default "";
	String[] value() default {};
}
