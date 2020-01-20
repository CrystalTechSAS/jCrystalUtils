/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.configs.clients;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Client implements Serializable{
	private static final long serialVersionUID = -2328141684625590053L;

	public final ClientType type;
	public final String id;
	public transient String output;
	public boolean localOutput = false;
	public final List<IInternalConfig> configs = new ArrayList<>();
	
	protected Client(ClientType type, String id) {
		this.type = type;
		this.id = id;
	}
	public Client setOutput(String output) {
		this.output = output;
		localOutput = output != null;
		return this;
	}
	public Client setServerUrl(String url) {
		while (url != null && url.endsWith("/"))
			url = url.substring(0, url.length() - 1);
		configs.add(new DefaultInternalConfig().baseURL(url));
		return this;
	}
	public Client clone(ClientType type){
		Client ret = new Client(type, id);
		ret.output = output;
		ret.configs.addAll(configs);
		return ret;
	}
}
