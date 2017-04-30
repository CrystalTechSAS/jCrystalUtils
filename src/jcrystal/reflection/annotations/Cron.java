package jcrystal.reflection.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Cron {
	String value();
	String name() default "";
	String desc() default "default description";
	String timeZone() default "America/Bogota";
}
