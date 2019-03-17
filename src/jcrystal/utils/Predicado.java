/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface Predicado<T> {
	public boolean eval(T elemento);
}
