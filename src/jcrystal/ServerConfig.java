/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal;

import java.io.Serializable;

public class ServerConfig implements Serializable{
	public static ServerConfig lastInstance; 
	
	private static final long serialVersionUID = 5184770722809702499L;

	/** El paquete donde se almacenan las interfaces generadas por jCrystal */
	private String packageInterfaces;
	/** El nombre del servlet a ser generado para ser usado en los web services */
	private String servletPackage;
	private String GCMToken;
	private boolean enableJSF = false;
	
	public ServerConfig() {
		lastInstance = this;
	}
	
	public String firebaseKey;
	public String firebaseDB;
	
	public boolean isAppEngine = true;
	public boolean DEBUG = false;
	public String servlet_root_path = "/api";
	
	public void setAppEngine(boolean isAppEngine) {
		this.isAppEngine = isAppEngine;
	}
	public boolean isAppEngine() {
		return isAppEngine;
	}
	
	public void setGCMToken(String gCMToken) {
		GCMToken = gCMToken;
	}
	public void setServletPackage(String servletPackage) {
		this.servletPackage = servletPackage;
	}
	public void setPackageInterfaces(String packageInterfaces) {
		this.packageInterfaces = packageInterfaces;
	}
	public void setEnableJSF(boolean enableJSF) {
		this.enableJSF = enableJSF;
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
	public String getPackageInterfaces() {
		return packageInterfaces;
	}
	public String getServletPackage() {
		return servletPackage;
	}
	public boolean isEnableJSF() {
		return enableJSF;
	}
	public String getFirebaseDB() {
		return firebaseDB;
	}
	public String getFirebaseKey() {
		return firebaseKey;
	}
}