package jcrystal.reflection.annotations.async;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Cron {
	String value();
	String timeZone() default "America/Bogota";
	int minRetrySec() default 0;
	int maxDoublings() default 0;
}
