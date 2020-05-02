package jcrystal.configs.server.integrations;

import java.io.Serializable;
import java.nio.file.Path;

public class FirebaseConfig implements Serializable{

	private static final long serialVersionUID = -3786960648172653509L;

	public String GCMToken;
	public String devAccountService;
	public String prodAccountService;
	
	public void setGCMToken(String gCMToken) {
		GCMToken = gCMToken;
	}
	
	public String getGCMToken() {
		return GCMToken;
	}
	public void devAccountService(Path location) {
		this.devAccountService = location.toString();
	}
	public void prodAccountService(Path location) {
		this.prodAccountService = location.toString();
	}
}
