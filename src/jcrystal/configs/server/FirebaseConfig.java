package jcrystal.configs.server;

import java.io.Serializable;

public class FirebaseConfig implements Serializable{

	private static final long serialVersionUID = -3786960648172653509L;

	public String GCMToken;
	
	public String firebaseKey;
	public String firebaseDB;
	
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
}
