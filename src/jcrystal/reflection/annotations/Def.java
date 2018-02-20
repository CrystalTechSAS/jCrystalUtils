package jcrystal.reflection.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Def {
	String str() default "";
	int I() default 0;
	double D() default 0;
	boolean B() default false;
	long L() default 0;
}
