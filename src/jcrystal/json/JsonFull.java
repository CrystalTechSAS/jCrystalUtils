package jcrystal.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JsonFull {
	JsonLevel level = JsonLevel.FULL;
	Class[] value() default {};
}
