package jcrystal.clients;

import java.util.List;

public interface IInternalConfig {
	public String id();
	public String SUCCESS_NAME();
	public Class<?> SUCCESS_TYPE();
	public Object SUCCESS_DAFAULT_VALUE();
	public String ERROR_MESSAGE_NAME();
	public String SUCCESS_CONDITION();
	public String ERROR_CONDITION();
	public String UNATHORIZED_CONDITION();
	public boolean embeddedResponse();
	/**
	*
	* @param platform ios o android
	* @return
	*/
	public String BASE_URL(String platform);
	public default String getDefId() {
		if(id()==null)
			return "Default";
		return id();
	}
}
