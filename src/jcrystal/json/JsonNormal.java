package jcrystal.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JsonNormal {
    JsonLevel level = JsonLevel.NORMAL;
    Class[] value() default {};
}
