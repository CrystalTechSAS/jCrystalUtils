package jcrystal.reflection.annotations.ws;

public enum Method {
	GET, POST, PUT, DELETE, PATCH, HEAD, DEFAULT;
	public boolean isGetLike() {
		return this == GET || this == DELETE || this == HEAD; 
	}
	public boolean isPostLike() {
		return this == PATCH || this == POST || this == PUT; 
	}
}
