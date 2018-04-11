package jcrystal.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Text;

public class EntityUtils {
	public static JSONArray getJsonArray(Entity ent, String key) {
		String temp = getString(ent, key);
		if(temp == null)
			return null;
		return new JSONArray(temp);
	}
	public static JSONObject getJsonObject(Entity ent, String key) {
		String temp = getString(ent, key);
		if(temp == null)
			return null;
		return new JSONObject(temp);
	}
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
	public static boolean getBool(Entity ent, String key, boolean defaultValue){
		Object t = ent.getProperty(key);
		if(t==null)return defaultValue;
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
	public static <T> List<T> getList(Entity ent, String key){
		final Object t = ent.getProperty(key+".size");
		if(t==null || !(t instanceof Long))
			return new ArrayList<>(0);
		final int size = ((Long)t).intValue();
		ArrayList<T> ret = new ArrayList<>(size);
		for(int e = 0; e < size; e++)
			ret.add((T)ent.getProperty(key + "."+e));
		return ret;
	}
	//TO JSON UTILS
	public static <E> void toJson(java.io.PrintWriter _pw, java.lang.Iterable<E> lista, Consumer<E> writer){
		_pw.print("[");
		java.util.Iterator<E> iterator = lista.iterator();
		if(iterator.hasNext()){
			E valor = iterator.next();
			writer.accept(valor);
			while(iterator.hasNext()){
				valor = iterator.next();
				_pw.print(",");
				writer.accept(valor);
			}
		}
		_pw.print("]");
	}
	public static <T> void toJson(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<T>> lista, Consumer<T> writer)throws java.io.IOException{
		_pw.print("[");
		if(lista != null){
			if(lista.getItem() != null){
				java.util.Iterator<T> iterator = lista.getItem().iterator();
				if(iterator.hasNext()){
					T valor = iterator.next();
					writer.accept(valor);
					while(iterator.hasNext()){
						valor = iterator.next();
						_pw.print(",");
						writer.accept(valor);
					}
				}
			}
			lista.append(_pw, lista.getItem()!=null && lista.getItem().isEmpty());
		}
		_pw.print("]");
	}
	public static <T> void toJson(java.io.PrintWriter _pw, java.util.Map<Long, T> mapa, Consumer<T> writer){
		_pw.print("{");
		java.util.Iterator<java.util.Map.Entry<Long, T>> iterator = mapa.entrySet().iterator();
		if(iterator.hasNext()){
			java.util.Map.Entry<Long, T> valor = iterator.next();
			jcrystal.PrintWriterUtils.print(_pw, "\"", valor.getKey(), "\":");
			writer.accept(valor.getValue());
			while(iterator.hasNext()){
				valor = iterator.next();
				jcrystal.PrintWriterUtils.print(_pw, ",\"", valor.getKey(), "\":");
				writer.accept(valor.getValue());
			}
		}
		_pw.print("}");
	}
}
