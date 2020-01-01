package jcrystal.configs.clients;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jcrystal.exceptions.jCrystalConfigException;

public class ClientConfig implements Serializable{

	private static final long serialVersionUID = 620215157313016378L;

	public List<Client> list = new ArrayList<>();
	
	/**
	 * A server url to be used by default for clients
	 */
	private String globalServerUrl;
	
	public String getGlobalServerUrl() {
		return globalServerUrl;
	}
	public void setGlobalServerUrl(String globalServerUrl) {
		this.globalServerUrl = globalServerUrl;
	}
	
	public Client add(ClientType type, String id) {
		switch (type) {
		case ANDROID:
		case IOS:
			throw new jCrystalConfigException("Please use addMobile for Mobile clients or add Android and addiOS for Android and iOS");
		default:
			Client ret = new Client(type, id);
			list.add(ret);
			return ret;
		}
	}
	public JClientMobile addMobile(String id) {
		JClientMobile ret = new JClientMobile(id);
		list.add(ret.clientAndroid);
		list.add(ret.clientIOS);
		return ret;
	}
	public JClientAndroid addAndroid(String id) {
		JClientAndroid ret = new JClientAndroid(id);
		list.add(ret);
		return ret;
	}
	public JClientIOS addiOS(String id) {
		JClientIOS ret = new JClientIOS(id);
		list.add(ret);
		return ret;
	}
}
