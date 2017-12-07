package jcrystal.reflection.annotations.entities;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RelMto1 {
    String name() default "";
}
