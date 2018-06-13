package jcrystal.reflection.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import jcrystal.datetime.DateType;

@Retention(RetentionPolicy.RUNTIME)
public @interface CrystalDate {
	DateType value();
}
