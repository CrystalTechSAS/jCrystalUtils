package jcrystal;

import com.google.appengine.api.datastore.Email;
import com.google.appengine.api.datastore.GeoPt;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by G on 11/14/2016.
 */
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
    public static String json(GeoPt a){return "["+Float.toString(a.getLatitude())+","+Float.toString(a.getLongitude())+"]";}
    public static String json(Email a){return JSONObject.quote(a.getEmail());}
    public static String json(List<GeoPt> puntos){
        boolean coma=false;
        String ret = "[";
        for(GeoPt pt : puntos){
            if(coma)ret += ",["+Float.toString(pt.getLatitude())+","+Float.toString(pt.getLongitude())+"]";
            else ret += "["+Float.toString(pt.getLatitude())+","+Float.toString(pt.getLongitude())+"]";
            coma = true;
        }
        return ret+"]";
    }

}
