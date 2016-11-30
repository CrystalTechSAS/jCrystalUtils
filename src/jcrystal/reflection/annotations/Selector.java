package jcrystal.reflection.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by g on 9/7/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Selector {
    String valor() default "";
}
