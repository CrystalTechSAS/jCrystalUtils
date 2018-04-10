package jcrystal.clients.admin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value= {ElementType.METHOD})
public @interface ListOption {
	String name() default "Opción extra";
	String icon() default "question";
}
