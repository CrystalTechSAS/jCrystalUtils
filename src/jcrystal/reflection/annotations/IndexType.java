/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.reflection.annotations;

/**
 * Indext type for an entity property
 * @author gasotelo
 *
 */
public enum IndexType {
	/**
	 * No index
	 */
	NONE, 
	/**
	 * The most simple type of index. The field is indexed and a query over a value this field can retrieve multiple entities.
	 */
	MULTIPLE,
	/**
	 * Indexed, it suppose you avoid to add multiple entities for the same value. You must encourage to do so.
	 */
	UNIQUE,
	/**
	 * Indexed. It allow only one entity per value. If you try to put a second entity with the same value jCrystal will generate an exception  
	 */
	UNIQUE_VERIFICATION;
	public boolean isUnique() {
		return this == IndexType.UNIQUE || this == UNIQUE_VERIFICATION;
	}
}
