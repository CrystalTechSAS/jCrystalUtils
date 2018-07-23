package jcrystal.clients;

import java.io.Serializable;

public class JClientIOS extends Client implements Serializable{
	private static final long serialVersionUID = -1466840809186165984L;

	public JClientIOS(String id) {
		super(ClientType.IOS, id);
	}
	public boolean firebasCrashReportingEnabled = false;
	
	public boolean getFirebaseCrashReportingEnabled() {
		return firebasCrashReportingEnabled;
	}
	public JClientIOS enableFirebasCrashReporting() {
		this.firebasCrashReportingEnabled = true;
		return this;
	}
}
