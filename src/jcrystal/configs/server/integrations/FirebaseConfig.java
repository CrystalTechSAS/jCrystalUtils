package jcrystal.configs.server.integrations;

import java.io.Serializable;

public class FirebaseConfig implements Serializable{

	private static final long serialVersionUID = -3786960648172653509L;

	public String GCMToken;
	
	public void setGCMToken(String gCMToken) {
		GCMToken = gCMToken;
	}
	
	public String getGCMToken() {
		return GCMToken;
	}
}
