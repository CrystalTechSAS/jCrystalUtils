package jcrystal.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JsonMin {
    JsonLevel level = JsonLevel.MIN;
    Class[] value() default {};
}
