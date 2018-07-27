package jcrystal;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;

import jcrystal.local.LocalPaths;

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
	
	//TODO: Eliminar del servidor

	public transient File srcFile = LocalPaths.srcFile;
	public transient File srcUtils = LocalPaths.srcUtils;
	public transient File webSrcFile = LocalPaths.webSrcFile;
}