package jcrystal.reflection.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import jcrystal.json.JsonLevel;
import jcrystal.reflection.TipoRuta;

@Retention(RetentionPolicy.RUNTIME)
public @interface JsonPost {
	TipoRuta tipo() default TipoRuta.POST;
}
