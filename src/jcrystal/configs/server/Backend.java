package jcrystal.configs.server;

import java.io.Serializable;

import jcrystal.lang.Language;

public class Backend implements Serializable, Comparable<Backend>{

	private static final long serialVersionUID = 935688722177922020L;

	public String id;
	
	public Language lang;
	
	public Backend(String id, Language lang) {
		super();
		this.id = id;
		this.lang = lang;
	}

	public transient String output;
	
	public Backend setOutput(String output) {
		this.output = output;
		return this;
	}

	@Override
	public int compareTo(Backend arg0) {
		return id.compareTo(arg0.id);
	}
	
}
