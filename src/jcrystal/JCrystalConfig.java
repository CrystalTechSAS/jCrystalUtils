package jcrystal;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jcrystal.clients.Client;

public class JCrystalConfig {
	
	/** El paquete donde se almacenan las interfaces generadas por jCrystal */
	private static String packageInterfaces;
	/** El nombre del servlet a ser generado para ser usado en los web services */
	private static String servletPackage;
	private static String GCMToken;
	private static boolean enableJSF = false;
	
	public static String firebaseKey;
	public static String firebaseDB;
	
	public static final File srcFile = getExistingFolder("src/main/java","src/java","src");
	public static final File srcUtils = new File(srcFile.getParentFile(), "utils");
	public static final File webSrcFile = getExistingFolder("src/main/webapp","WebContent","war","web");
	public static boolean isAppEngine = true;
	public static void setAppEngine(boolean isAppEngine) {
		JCrystalConfig.isAppEngine = isAppEngine;
	}
	public static boolean isAppEngine() {
		return isAppEngine;
	}
	
	public static void setGCMToken(String gCMToken) {
		GCMToken = gCMToken;
	}
	public static void setServletPackage(String servletPackage) {
		JCrystalConfig.servletPackage = servletPackage;
		if(JCrystalConfig.servletPackage != null)
			new File(srcUtils, JCrystalConfig.servletPackage.replace(".", "/")).mkdirs();
		
	}
	public static void setPackageInterfaces(String packageInterfaces) {
		JCrystalConfig.packageInterfaces = packageInterfaces;
	}
	public static void setEnableJSF(boolean enableJSF) {
		JCrystalConfig.enableJSF = enableJSF;
	}
	public static void setFirebaseKey(String firebaseKey) {
		JCrystalConfig.firebaseKey = firebaseKey;
	}
	public static void setFirebaseDB(String firebaseDB) {
		JCrystalConfig.firebaseDB = firebaseDB;
	}
	
	public static String getGCMToken() {
		return GCMToken;
	}
	public static String getPackageInterfaces() {
		return packageInterfaces;
	}
	public static String getServletPackage() {
		return servletPackage;
	}
	public static boolean isEnableJSF() {
		return enableJSF;
	}
	public static String getFirebaseDB() {
		return firebaseDB;
	}
	public static String getFirebaseKey() {
		return firebaseKey;
	}
	private static boolean firebasCrashReportingEnabled = false;
	public static boolean getFirebaseCrashReportingEnabled() {
		return firebasCrashReportingEnabled;
	}
	public static void setFirebasCrashReportingEnabled(boolean firebasCrashReportingEnabled) {
		JCrystalConfig.firebasCrashReportingEnabled = firebasCrashReportingEnabled;
	}
	private static File getExistingFolder(String...files) {
		for(String f : files)if(new File(f).exists())return new File(f);
		throw new NullPointerException("Folder not found "+ Arrays.toString(files));
	}
}
