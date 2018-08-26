package jcrystal.clients;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public final class DefaultInternalConfig implements IInternalConfig, Serializable{
	private static final long serialVersionUID = -5447803111496332057L;
	
	private String id;
	private boolean embeddedResponse;
	
	private String baseURL;
	private Map<String, String> baseUrlConfigs = new TreeMap<>();
	
	@Override public String SUCCESS_NAME() {
		return "success";
	}
	@Override public Class<?> SUCCESS_TYPE() {
		return int.class;
	}
	@Override public Object SUCCESS_DAFAULT_VALUE() {
		return 1;
	}
	@Override public String ERROR_MESSAGE_NAME() {
		return "mensaje";
	}
	@Override public String SUCCESS_CONDITION() {
		return SUCCESS_NAME()+" == 1";
	}
	@Override public String ERROR_CONDITION() {
		return SUCCESS_NAME()+" == 2";
	}
	@Override public String UNATHORIZED_CONDITION() {
		return SUCCESS_NAME()+" == 3";
	}
	@Override public String BASE_URL(String platform) {
		if(platform != null && baseUrlConfigs != null) {
			String ret = baseUrlConfigs.get(platform);
			if(ret != null)
				return ret;
		}
		return baseURL;
	}
	@Override
	public boolean embeddedResponse() {
		return embeddedResponse;
	}
	@Override
	public String id() {
		return id;
	}
	public DefaultInternalConfig id(String id) {
		this.id = id;
		return this;
	}
	
	public DefaultInternalConfig embeddedResponse(boolean value) {
		embeddedResponse = value;
		return this;
	}
	public DefaultInternalConfig baseURL(String baseURL) {
		this.baseURL = baseURL;
		return this;
	}
	public DefaultInternalConfig addUrlConfig(String platform, String url) {
		baseUrlConfigs.put(platform, url);
		return this;
	}
}
