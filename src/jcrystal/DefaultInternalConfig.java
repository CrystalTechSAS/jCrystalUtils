package jcrystal;

public class DefaultInternalConfig implements IInternalConfig{
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
		return JCrystalConfig.getServerUrl();
	}
}
