package jcrystal.utils;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Text;

public class EntityUtils {
	public static String getString(Entity ent, String key){
		Object t = ent.getProperty(key);
		if(t==null)return null;
		if(t instanceof Text)
			return ((Text)t).getValue();
		return (String)t;
	}
	public static boolean getBool(Entity ent, String key){
		Object t = ent.getProperty(key);
		if(t==null)return false;
		return (Boolean)t;
	}

	public static int getInt(Entity ent, String key, int defaultValue){
		Object t = ent.getProperty(key);
		if(t==null)return defaultValue;
		if(t instanceof Long)
			return ((Long)t).intValue();
		return (Integer)t;
	}
	public static double getDouble(Entity ent, String key, double defaultValue){
		Object t = ent.getProperty(key);
		if(t==null)return defaultValue;
		if(t instanceof Float)
			return ((Float)t).doubleValue();
		return (double)t;
	}
	public static int getInt(Entity ent, String key){
		Object t = ent.getProperty(key);
		if(t==null)return 0;
		if(t instanceof Long)
			return ((Long)t).intValue();
		return (Integer)t;
	}
	public static Integer getInteger(Entity ent, String key){
		Object t = ent.getProperty(key);
		if(t==null)return null;
		if(t instanceof Long)return ((Long)t).intValue();
		return (Integer)t;
	}
	public static long getLong(Entity ent, String key){
		Object t = ent.getProperty(key);
		if(t==null)return 0;
		if(t instanceof Integer)return ((Integer)t).longValue();
		return (Long)t;
	}
	public static Long getLongObj(Entity ent, String key){
		Object t = ent.getProperty(key);
		if(t==null)return null;
		if(t instanceof Integer)return ((Integer)t).longValue();
		return (Long)t;
	}
}
