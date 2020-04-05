package jcrystal.reflection.annotations.ws;

public @interface Http {
	String path() default "";
	Method method() default Method.DEFAULT;
	ContentType[] content() default {ContentType.DEFAULT};
	ResponseType response() default ResponseType.JSON;
}
