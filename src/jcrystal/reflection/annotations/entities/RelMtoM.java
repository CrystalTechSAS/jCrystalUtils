/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.reflection.annotations.entities;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import jcrystal.json.JsonLevel;

@Retention(RetentionPolicy.RUNTIME)
public @interface RelMtoM {
	String value();
	String target() default "";
	/**
	* True if this relation has a big cardinality (>4000). 4000 is the limit size for arrays on datastore
	* @return
	*/
	boolean small() default false;
	JsonLevel keyLevel() default JsonLevel.NONE;
	
}
