package jcrystal.utils;

import java.util.Date;

import com.google.appengine.api.datastore.GeoPt;
import jcrystal.utils.InternalException;

public class ManagerUtils {
	public static void assertFuture(Date date, String msg){
        if(date.getTime() <= System.currentTimeMillis())throw new InternalException(21, msg);
    }
    public static void assertNotEmpty(String val, String msg){
        if(isEmpty(val))throw new InternalException(21, msg);
    }
    public static void assertNotNull(Object val, String msg){
        if(val == null)throw new InternalException(21, msg);
    }
    public static void asserT(boolean cond, String msg){
        if(!cond)throw new InternalException(22, msg);
    }
    public static void asserT(int code, String msg, boolean cond){
        if(cond)throw new InternalException(code, msg);
    }
    public static boolean isEmpty(String val){
        return val == null || val.trim().isEmpty();
    }
    public static GeoPt geoPt(double lat, double lng){
        return new GeoPt((float)lat, (float)lng);
    }
}
