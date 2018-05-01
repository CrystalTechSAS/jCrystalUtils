package jcrystal;

public interface IInternalConfig {
	public String SUCCESS_NAME();
	public Class<?> SUCCESS_TYPE();
	public Object SUCCESS_DAFAULT_VALUE();
	public String ERROR_MESSAGE_NAME();
	public String SUCCESS_CONDITION();
	public String ERROR_CONDITION();
	public String UNATHORIZED_CONDITION();
	/**
	*
	* @param platform ios o android
	* @return
	*/
	public String BASE_URL(String platform);
}
