package jcrystal;

import java.io.Serializable;

public class WebServerConfig implements Serializable {

	private static final long serialVersionUID = -9009627464519568919L;
	
	/** El paquete base donde se almacenan las clases generadas */
	private String basePackage = "com.jcrystal.servlets";
	
	private boolean enableJSF = false;
	public String servlet_root_path = "/api";
	
	public String getBasePackage() {
		return basePackage;
	}
	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}
	public boolean isEnableJSF() {
		return enableJSF;
	}
	public void setEnableJSF(boolean enableJSF) {
		this.enableJSF = enableJSF;
	}
}
