package jcrystal.reflection.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import jcrystal.reflection.TipoRuta;

@Retention(RetentionPolicy.RUNTIME)
public @interface Path {
	String value();
}
