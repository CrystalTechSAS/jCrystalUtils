package jcrystal;

import java.io.Serializable;

public class WebServerConfig implements Serializable {

	private static final long serialVersionUID = -9009627464519568919L;
	
	/** El paquete donde se almacenan las interfaces generadas por jCrystal */
	private String packageInterfaces;
	/** El nombre del servlet a ser generado para ser usado en los web services */
	private String servletPackage;
	
	private boolean enableJSF = false;
	public String servlet_root_path = "/api";
	
	public void setServletPackage(String servletPackage) {
		this.servletPackage = servletPackage;
	}
	public void setPackageInterfaces(String packageInterfaces) {
		this.packageInterfaces = packageInterfaces;
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
	public void setEnableJSF(boolean enableJSF) {
		this.enableJSF = enableJSF;
	}
}
