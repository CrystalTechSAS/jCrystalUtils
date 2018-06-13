package jcrystal.clients;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import jcrystal.JCrystalConfig;

public class Client {
	public static List<Client> CLIENTES = new ArrayList<>();
	
	public final ClientType type;
	public final String id;
	public String output;
	public String serverUrl;
	
	public Client(ClientType type, String id) {
		this.type = type;
		this.id = id;
		CLIENTES.add(this);
		serverUrl = "/";
		if(type == ClientType.ADMIN)
			output = new File(JCrystalConfig.webSrcFile,"admin").getAbsolutePath();
		else
			output = new File("./"+type.name().toLowerCase()).getAbsolutePath();
	}
	public Client setOutput(String output) {
		this.output = output;
		return this;
	}
	public Client setServerUrl(String serverUrl) {
		while (serverUrl != null && serverUrl.endsWith("/"))
			serverUrl = serverUrl.substring(0, serverUrl.length() - 1);
		this.serverUrl = serverUrl;
		return this;
	}
}
