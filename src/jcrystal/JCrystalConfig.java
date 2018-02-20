package jcrystal;


import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class JCrystalConfig {

	private static File outFolderIOS;
	private static File outFolderAndroid;
	private static File outFolderWeb;
	public static JSType jsType = JSType.ANGULAR;
	private static File outFolderConsole;
	/** El paquete donde se almacenan las interfaces generadas por jCrystal */
	private static String packageInterfaces;
	/** El nombre del servlet a ser generado para ser usado en los web services */
	private static String servletName;
	private static String GCMToken;
	private static boolean enableJSF = false;
	
	public static String firebaseKey;
	public static String firebaseDB;
	public static String serverUrl;
	public static String serverWebUrl;
	
	public static final File srcFile = getExistingFolder("src/main/java","src/java","src");
	public static final File webSrcFile = getExistingFolder("src/main/webapp","WebContent","war","web");
	public static boolean isAppEngine = true;
	public static void setAppEngine(boolean isAppEngine) {
		JCrystalConfig.isAppEngine = isAppEngine;
	}
	public static boolean isAppEngine() {
		return isAppEngine;
	}
	public static void setServerUrl(String serverUrl) {
		while (serverUrl != null && serverUrl.endsWith("/"))
			serverUrl = serverUrl.substring(0, serverUrl.length() - 1);
		JCrystalConfig.serverUrl = serverUrl;
	}
	public static void setServerWebUrl(String serverWebUrl) {
		while (serverWebUrl != null && serverWebUrl.endsWith("/"))
			serverWebUrl = serverWebUrl.substring(0, serverWebUrl.length() - 1);
		JCrystalConfig.serverWebUrl = serverWebUrl;
	}
	public static void setOutFolderWeb(String outFolderWeb) {
		if(outFolderWeb !=null && (new File(outFolderWeb).exists() || new File(outFolderWeb).mkdirs()))
			JCrystalConfig.outFolderWeb = new File(outFolderWeb);
		else
			JCrystalConfig.outFolderWeb = null;
	}
	public static void setOutFolderMobile(String outFolderMobile) {
		if(outFolderMobile != null && (new File(outFolderMobile).exists() || new File(outFolderMobile).mkdirs())){
			setOutFolderIOS(outFolderMobile+"/ios");
			setOutFolderAndroid(outFolderMobile+"/android");
		}else{
			JCrystalConfig.outFolderAndroid = null;
			JCrystalConfig.outFolderIOS = null;
		}
	}
	public static void setOutFolderConsole(String outFolderConsole) {
		if(outFolderAndroid !=null && (new File(outFolderConsole).exists() || new File(outFolderConsole).mkdirs()))
			JCrystalConfig.outFolderConsole = new File(outFolderConsole);
		else
			JCrystalConfig.outFolderConsole = null;
	}
	public static void setOutFolderAndroid(String outFolderAndroid) {
		if(outFolderAndroid !=null && (new File(outFolderAndroid).exists() || new File(outFolderAndroid).mkdirs()))
			JCrystalConfig.outFolderAndroid = new File(outFolderAndroid);
		else
			JCrystalConfig.outFolderAndroid = null;
	}
	public static void setOutFolderIOS(String outFolderIOS) {
		if(outFolderIOS != null && (new File(outFolderIOS).exists() || new File(outFolderIOS).mkdirs()))
			JCrystalConfig.outFolderIOS = new File(outFolderIOS);
		else 
			JCrystalConfig.outFolderIOS = null;
	}
	public static void setGCMToken(String gCMToken) {
		GCMToken = gCMToken;
	}
	public static void setServletName(String servletName) {
		JCrystalConfig.servletName = servletName;
		if(JCrystalConfig.servletName != null)
			new File(srcFile, JCrystalConfig.servletName.replace(".", "/") + ".java").delete();
		
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
	
	public static File getOutFolderAndroid() {
		return outFolderAndroid;
	}
	public static String getGCMToken() {
		return GCMToken;
	}
	public static File getOutFolderIOS() {
		return outFolderIOS;
	}
	public static File getOutFolderWeb() {
		return outFolderWeb;
	}
	public static String getPackageInterfaces() {
		return packageInterfaces;
	}
	public static String getServletName() {
		return servletName;
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
	public static String getServerUrl() {
		return serverUrl;
	}
	public static String getServerWebUrl() {
		return serverWebUrl;
	}
	public static File getOutFolderConsole() {
		return outFolderConsole;
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
