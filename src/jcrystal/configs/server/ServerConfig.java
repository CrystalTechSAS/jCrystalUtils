/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.configs.server;

import java.io.Serializable;

import jcrystal.configs.server.dbs.DBConfig;

public class ServerConfig implements Serializable{
	private static final long serialVersionUID = 5184770722809702499L;

	public boolean isAppEngine = true;
	
	public final DBConfig DB = new DBConfig();
	public final FirebaseConfig FIREBASE = new FirebaseConfig();
	public final WebServerConfig WEB = new WebServerConfig();
	
	public final DebugInfo DEBUG = new DebugInfo();
	
	public void setAppEngine(boolean isAppEngine) {
		this.isAppEngine = isAppEngine;
	}
	public boolean isAppEngine() {
		return isAppEngine;
	}
}