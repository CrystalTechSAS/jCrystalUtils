/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.reflection;

/**
* Created by gasotelo on 2/11/17.
*/
public enum TipoRuta {
	GET, POST, PUT, PATH, DELETE, PATCH, HEADER;
	public boolean isGetLike() {
		return this == GET || this == DELETE; 
	}
	public boolean isPostLike() {
		return this == PATCH || this == POST || this == PUT; 
	}
}
