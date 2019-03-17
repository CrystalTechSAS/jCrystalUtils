/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.clients;

import java.io.Serializable;

public class JClientAndroid extends Client implements Serializable{
	private static final long serialVersionUID = -4229993352921051902L;

	public JClientAndroid(String id) {
		super(ClientType.ANDROID, id);
	}
	public boolean firebasCrashReportingEnabled = false;
	
	public boolean getFirebaseCrashReportingEnabled() {
		return firebasCrashReportingEnabled;
	}
	public JClientAndroid enableFirebasCrashReporting() {
		this.firebasCrashReportingEnabled = true;
		return this;
	}
}
