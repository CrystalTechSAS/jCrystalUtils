package jcrystal.reflection.annotations;

import jcrystal.datetime.DateType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by g on 9/7/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface EntityKey {
    DateType dateType() default DateType.DATETIME;
    int GMT() default 0;
}
