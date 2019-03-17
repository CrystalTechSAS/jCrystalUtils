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
public @interface RelMto1 {
	String name() default "";
	String target() default "";
	JsonLevel keyLevel() default JsonLevel.NONE;
	boolean editable() default false;
}
