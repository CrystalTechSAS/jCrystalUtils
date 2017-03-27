package jcrystal.reflection.annotations;

import jcrystal.json.JsonLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by g on 9/7/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface EntityPartitionKey {
    String value() default "";
    boolean duplicate() default false;
    JsonLevel json() default JsonLevel.NONE;
}
