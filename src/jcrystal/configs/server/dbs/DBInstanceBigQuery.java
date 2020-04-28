package jcrystal.configs.server.dbs;

public final class DBInstanceBigQuery extends DBInstance{

	private static final long serialVersionUID = 6851756725011893341L;

	private String datasetId;
	
	public DBInstanceBigQuery(String id, String datasetId) {
		super(DBType.GOOGLE_BIG_QUERY, id);
		this.datasetId = datasetId;
	}
	public String getDatasetId() {
		return datasetId;
	}
}
