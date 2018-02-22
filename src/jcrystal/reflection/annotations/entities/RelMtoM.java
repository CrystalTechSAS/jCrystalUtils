package jcrystal.reflection.annotations.entities;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RelMtoM {
    String value();
    String target() default "";
    /**
     * True if this relation has a big cardinality (>4000). 4000 is the limit size for arrays on datastore
     * @return
     */
    boolean small() default false;
}
