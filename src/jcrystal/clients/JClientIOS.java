/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.clients;

import java.io.Serializable;

public class JClientIOS extends Client implements Serializable{
	private static final long serialVersionUID = -1466840809186165984L;

	protected JClientIOS(String id) {
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
