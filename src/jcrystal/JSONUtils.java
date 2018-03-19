package jcrystal;

import org.json.JSONObject;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class JSONUtils {
    public static String json(String valor){
        return JSONObject.quote(valor);
    }
    public static String json(long a){return Long.toString(a);}
    public static String json(int a){return Integer.toString(a);}
    public static String json(int[] a){
        String ret = "[";
        if(a.length>0)ret += a[0];
        for(int e=1;e<a.length;e++)
            ret+=","+a[e];
        return ret+"]";
    }
    public static String json(double a){return Double.toString(a);}
    public static String json(boolean a){return Boolean.toString(a);}

    public static String jsonQuote(String valor){
        return JSONObject.quote(valor);
    }
    public static String jsonQuote(long a){return Long.toString(a);}
    public static String jsonQuote(int a){return Integer.toString(a);}
    public static String jsonQuote(int[] a){
        String ret = "[";
        if(a.length>0)ret += a[0];
        for(int e=1;e<a.length;e++)
            ret+=","+a[e];
        return ret+"]";
    }
    public static String jsonQuote(String[] a){
        String ret = "[";
        if(a.length>0)ret += JSONObject.quote(a[0]);
        for(int e=1;e<a.length;e++)
            ret+=","+JSONObject.quote(a[e]);
        return ret+"]";
    }
    public static String jsonQuote(double[] a){
        String ret = "[";
        if(a.length>0)ret += Double.toString(a[0]);
        for(int e=1;e<a.length;e++)
            ret+=","+Double.toString(a[e]);
        return ret+"]";
    }
    public static String jsonQuote(long[] a){
        String ret = "[";
        if(a.length>0)ret += Long.toString(a[0]);
        for(int e=1;e<a.length;e++)
            ret+=","+Long.toString(a[e]);
        return ret+"]";
    }
    public static String jsonQuote(double a){return Double.toString(a);}
    public static String jsonQuote(boolean a){return Boolean.toString(a);}
    public static String json(com.google.appengine.api.datastore.GeoPt a){return "["+Float.toString(a.getLatitude())+","+Float.toString(a.getLongitude())+"]";}
    public static String json(com.google.appengine.api.datastore.Email a){return JSONObject.quote(a.getEmail());}
    public static String jsonQuote(com.google.appengine.api.datastore.GeoPt a){return "["+Float.toString(a.getLatitude())+","+Float.toString(a.getLongitude())+"]";}
    public static String jsonQuote(com.google.appengine.api.datastore.Email a){return JSONObject.quote(a.getEmail());}
    public static String jsonQuote(List<com.google.appengine.api.datastore.GeoPt> puntos){
        boolean coma=false;
        String ret = "[";
        for(com.google.appengine.api.datastore.GeoPt pt : puntos){
            if(coma)ret += ",["+JSONObject.doubleToString(pt.getLatitude()) + "," + JSONObject.doubleToString(pt.getLongitude()) + "]";
            else ret += "["+JSONObject.doubleToString(pt.getLatitude()) + "," + JSONObject.doubleToString(pt.getLongitude()) + "]";
            coma = true;
        }
        return ret+"]";
    }
    public static String jsonQuoteString(List<String> puntos){
        Iterator<String> it = puntos.iterator();
        String ret = "[";
        if(it.hasNext())ret += jsonQuote(it.next());
        while(it.hasNext())
        		ret += ","+jsonQuote(it.next());
        return ret+"]";
    }
    public static String jsonQuoteLong(List<Long> puntos){
        Iterator<Long> it = puntos.iterator();
        String ret = "[";
        if(it.hasNext())ret += it.next();
        while(it.hasNext())
        		ret += ","+it.next().toString();
        return ret+"]";
    }
    public static String jsonQuoteInteger(List<Integer> puntos){
        Iterator<Integer> it = puntos.iterator();
        String ret = "[";
        if(it.hasNext())ret += it.next();
        while(it.hasNext())
        		ret += ","+it.next().toString();
        return ret+"]";
    }
    
    public static void jsonQuoteString(PrintWriter _pw, List<String> puntos){
        Iterator<String> it = puntos.iterator();
        _pw.print("[");
        if(it.hasNext())_pw.print(jsonQuote(it.next()));
        while(it.hasNext()) {
        		_pw.print(",");
        		_pw.print(jsonQuote(it.next()));
        }
        _pw.print("]");
    }
    public static void jsonQuoteLong(PrintWriter _pw, List<Long> puntos){
        Iterator<Long> it = puntos.iterator();
        _pw.print("[");
        if(it.hasNext())_pw.print(it.next());
        while(it.hasNext()) {
        		_pw.print(",");
        		_pw.print(it.next());
        }
        _pw.print("]");
    }
    public static void jsonQuoteInteger(PrintWriter _pw, List<Integer> puntos){
    		Iterator<Integer> it = puntos.iterator();
        _pw.print("[");
        if(it.hasNext())_pw.print(it.next());
        while(it.hasNext()) {
        		_pw.print(",");
        		_pw.print(it.next());
        }
        _pw.print("]");
    }
}
