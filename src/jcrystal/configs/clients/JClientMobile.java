/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.configs.clients;

public class JClientMobile{
	
	JClientAndroid clientAndroid;
	JClientIOS clientIOS;
	
	protected JClientMobile(String id) {
		clientAndroid = new JClientAndroid(id);
		clientIOS = new JClientIOS(id);
	}
	public JClientMobile setOutputAndroid(String outputAndroid) {
		clientAndroid.setOutput(outputAndroid);
		return this;
	}
	public JClientMobile setOutputiOS(String outputiOS) {
		clientIOS.setOutput(outputiOS);
		return this;
	}
	public JClientMobile setOutput(String output) {
		setOutputAndroid(output+"/android");
		setOutputiOS(output+"/ios");
		return this;
	}
	public JClientMobile setServerUrl(String url) {
		clientAndroid.setServerUrl(url);
		clientIOS.setServerUrl(url);
		return this;
	}
	public JClientMobile addInternalConfig(IInternalConfig config) {
		clientAndroid.configs.add(config);
		clientIOS.configs.add(config);
		return this;
	}
	
}
