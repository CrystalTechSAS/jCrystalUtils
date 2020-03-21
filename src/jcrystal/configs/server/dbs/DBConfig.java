package jcrystal.configs.server.dbs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DBConfig implements Serializable{

	private static final long serialVersionUID = 8099533307912205160L;

	public DBInstance MAIN = new DBInstance(this, DBType.GOOGLE_DATASTORE, null);
	
	public List<DBInstance> list = new ArrayList<>();
	
	public DBInstanceBigQuery addGoogleBigQuery(String id, String datasetId) {
		DBInstanceBigQuery db = new DBInstanceBigQuery(this, id, datasetId);
		if(id == null)
			MAIN = db;
		else
			list.add(db);
		return db;
	}
	public DBInstanceFirestore addFirestore(String id, String projectId) {
		DBInstanceFirestore db = new DBInstanceFirestore(this, id, projectId);
		if(id == null)
			MAIN = db;
		else
			list.add(db);
		return db;
	}
}
