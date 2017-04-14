package jcrystal.reflection.annotations;

import jcrystal.json.JsonLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by g on 9/7/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface EntityProperty {
    String name() default "";
    boolean indexed() default false;
    boolean unique() default false;
    boolean autoNow() default false;
    boolean editable() default true;
    JsonLevel json() default JsonLevel.NORMAL;
}
