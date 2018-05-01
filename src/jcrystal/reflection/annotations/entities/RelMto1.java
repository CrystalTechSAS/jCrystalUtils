package jcrystal.reflection.annotations.entities;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import jcrystal.json.JsonLevel;

@Retention(RetentionPolicy.RUNTIME)
public @interface RelMto1 {
	String name() default "";
	String target() default "";
	JsonLevel keyLevel() default JsonLevel.NONE;
	boolean editable() default false;
}
