package jcrystal.configs.server.dbs;

public final class DBInstanceRealtimeDB extends DBInstance{

	private static final long serialVersionUID = 6851756725011893341L;

	private String prodDB;
	private String devDB;
	
	public DBInstanceRealtimeDB(String id, String prodDB) {
		super(DBType.GOOGLE_REALTIMEDB, id);
		this.prodDB = prodDB;
	}
	
	public void prodDB(String prodDB) {
		this.prodDB = prodDB;
	}
	
	public String prodDB() {
		return prodDB;
	}
	
	public DBInstanceRealtimeDB devDB(String devDB) {
		this.devDB = devDB;
		return this;
	}
	public String devDB(){
		return devDB;
	}
}
