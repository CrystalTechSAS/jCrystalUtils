package jcrystal.configs.server.dbs;

import java.io.Serializable;

public class DBInstance implements Serializable{

	private static final long serialVersionUID = 6851756725011893341L;

	public final DBType type;
	public String id;
	protected DBInstance(DBType type, String id) {
		this.type = type;
		this.id = id;
	}
	public String getDBName() {
		return (id==null?"DefaultDB":id);
	}
}
