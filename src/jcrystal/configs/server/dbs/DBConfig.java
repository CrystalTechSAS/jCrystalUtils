package jcrystal.configs.server.dbs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DBConfig implements Serializable{

	private static final long serialVersionUID = 8099533307912205160L;

	public DBType mainDBType = DBType.GOOGLE_DATASTORE;
	
	public List<DBInstance> list = new ArrayList<>();
	
	public DBInstanceBigQuery addGoogleBigQuery(String id, String datasetId) {
		DBInstanceBigQuery db = new DBInstanceBigQuery(id, datasetId);
		list.add(db);
		return db;
	}
}
