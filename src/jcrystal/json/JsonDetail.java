package jcrystal.json;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JsonDetail {
	JsonLevel level = JsonLevel.DETAIL;
	Class[] value() default {};
}
