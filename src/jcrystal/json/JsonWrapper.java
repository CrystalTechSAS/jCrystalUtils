package jcrystal.json;

import jcrystal.preprocess.descriptions.IJType;
import jcrystal.preprocess.descriptions.JType;
import jcrystal.preprocess.descriptions.JTypeWrapper;

public class JsonWrapper extends JTypeWrapper{

	private static final long serialVersionUID = 1L;
	
	public final JsonLevel level;
	
	public JsonWrapper(JsonLevel level, IJType type) {
		super(type);
		this.level = level;
	}
	@Override
	public String toString() {
		return level+"("+super.toString()+")";
	}
}
