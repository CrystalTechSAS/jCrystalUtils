/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal;

import java.io.Serializable;

public class ServerConfig implements Serializable{
	private static final long serialVersionUID = 5184770722809702499L;

	public WebServerConfig web = new WebServerConfig();
	
	private String GCMToken;
	
	public String firebaseKey;
	public String firebaseDB;
	
	public boolean DEBUG = false;
	
	public void setGCMToken(String gCMToken) {
		GCMToken = gCMToken;
	}
	public void setFirebaseKey(String firebaseKey) {
		this.firebaseKey = firebaseKey;
	}
	public void setFirebaseDB(String firebaseDB) {
		this.firebaseDB = firebaseDB;
	}
	
	public String getGCMToken() {
		return GCMToken;
	}
	public String getFirebaseDB() {
		return firebaseDB;
	}
	public String getFirebaseKey() {
		return firebaseKey;
	}
	
	public boolean isAppEngine = true;
	public void setAppEngine(boolean isAppEngine) {
		this.isAppEngine = isAppEngine;
	}
	public boolean isAppEngine() {
		return isAppEngine;
	}
}