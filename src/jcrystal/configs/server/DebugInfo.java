package jcrystal.configs.server;

import java.io.Serializable;

public class DebugInfo implements Serializable{

	private static final long serialVersionUID = 1273793045508797206L;
	
	public boolean CORS = false;
	public boolean ENTITY_CHECKS = false;
	public boolean LOG_EXCEPTIONS = false;
}
