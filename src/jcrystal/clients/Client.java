/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.clients;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jcrystal.local.LocalPaths;

public class Client implements Serializable{
	private static final long serialVersionUID = -2328141684625590053L;

	public static List<Client> CLIENTES = new ArrayList<>();
	
	public final ClientType type;
	public final String id;
	public transient String output;
	public boolean localOutput = false;
	public final List<IInternalConfig> configs = new ArrayList<>();
	
	public Client(ClientType type, String id) {
		this.type = type;
		this.id = id;
		CLIENTES.add(this);
		if(type == ClientType.ADMIN)
			output = new File(LocalPaths.getWebSrcfile(),"admin").getAbsolutePath();
		else
			output = new File("./"+type.name().toLowerCase()).getAbsolutePath();
	}
	public Client setOutput(String output) {
		this.output = output;
		localOutput = output == null;
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
