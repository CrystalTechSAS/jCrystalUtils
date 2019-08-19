/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, August 2019
 */
package jcrystal.reflection.annotations.ws;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
	/**
	 * Names of the Tupla elements that will be datasource managed. Null names will be ommited. 
	 * @return
	 */
	String[] value() default {};
}
