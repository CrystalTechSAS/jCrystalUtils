package jcrystal.reflection.annotations.ws;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface Http {
	String path() default "";
	Method method() default Method.DEFAULT;
	ContentType[] content() default {ContentType.DEFAULT};
	ResponseType response() default ResponseType.JSON;
}
