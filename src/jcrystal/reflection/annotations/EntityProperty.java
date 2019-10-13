/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.reflection.annotations;

import jcrystal.json.JsonLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
* Created by g on 9/7/16.
*/
@Retention(RetentionPolicy.RUNTIME)
public @interface EntityProperty {
	String name() default ""; 
	IndexType index() default IndexType.NONE;
	boolean autoNow() default false;
	/**
	* Is user editable (via an api method)
	* @return
	*/
	boolean editable() default true;
	JsonLevel json() default JsonLevel.NORMAL;
}
