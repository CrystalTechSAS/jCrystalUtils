package jcrystal.configs.server.dbs;

public final class DBInstanceFirestore extends DBInstance{

	private static final long serialVersionUID = 6851756725011893341L;

	private String projectId;
	
	public DBInstanceFirestore(String id, String projectId) {
		super(DBType.GOOGLE_FIRESTORE, id);
		this.projectId = projectId;
	}
	public String getProjectId() {
		return projectId;
	}
}
