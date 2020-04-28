package jcrystal.configs.server.dbs;

public final class DBInstanceRealtimeDB extends DBInstance{

	private static final long serialVersionUID = 6851756725011893341L;

	private String firebaseDB;
	
	public DBInstanceRealtimeDB(DBConfig config, String id, String firebaseDB) {
		super(config, DBType.GOOGLE_REALTIMEDB, id);
		this.firebaseDB = firebaseDB;
	}
	
	public void firebaseDB(String firebaseDB) {
		this.firebaseDB = firebaseDB;
	}
	
	public String firebaseDB() {
		return firebaseDB;
	}
}
