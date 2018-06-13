package jcrystal.clients;

import java.util.ArrayList;
import java.util.List;

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
	}
	public Client setOutput(String output) {
		this.output = output;
		return this;
	}
	public Client setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
		return this;
	}
}
