package jcrystal.reflection.annotations.ws;

public enum ContentType {
	JSON, XML, UrlForm, MultipartForm, DEFAULT;
	public String getMimeType() {
		switch (this) {
			case JSON:
				return "application/json";
			case XML:
				return "application/xml";
			case MultipartForm:
				return "multipart/form-data";
			case UrlForm:
				return "application/x-www-form-urlencoded";
		default:
			return null;
		}
	}
	public boolean is(String contentType) {
		return contentType.toLowerCase().contains(getMimeType());
	}
}
