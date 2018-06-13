package jcrystal.clients;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.function.Predicate;

@Retention(RetentionPolicy.RUNTIME)
public @interface WebClient {
	public String id() default "";
}
