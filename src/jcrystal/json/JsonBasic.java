package jcrystal.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JsonBasic {
	JsonLevel level = JsonLevel.BASIC;
	Class[] value() default {};
}
