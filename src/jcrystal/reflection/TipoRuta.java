package jcrystal.reflection;

/**
* Created by gasotelo on 2/11/17.
*/
public enum TipoRuta {
	GET, POST, PUT, PATH, DELETE, PATCH;
	public boolean isGetLike() {
		return this == GET || this == DELETE; 
	}
	public boolean isPostLike() {
		return this == PATCH || this == POST || this == PUT; 
	}
}
