package jcrystal.apis;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.logging.Level;

import org.json.JSONObject;
import org.json.JSONTokener;

import jcrystal.utils.InternalException;

public class FBApi {
	public static void main(String...args) {
		getUserInfo("EAAbMKk1eVz0BAGfPXrSNOgE2TSRO2udLHkG7GSASAZB1qT4H11lRaDKP6ZCMCEZA0gkMZB3W0ehrELyKCZBdyqZClq0EDZANfgqGZCfqeWAAP3xgSzjGbjdTZAGiZBX7aRgJL4rcJYrJo2jbMEZC973AEjxHFoUmXPxHEHD4Q44uxo5rhcDViIvRJlfVKyArooMlkZAzVhyqGwyHv2hOab10Ncal");
	}
	public static FBUser getUserInfo(String token){
		try {
			HttpURLConnection connection = (HttpURLConnection) new URL("https://graph.facebook.com/v2.11/me?fields=id,name,about,birthday&access_token="+token).openConnection();
			connection.setRequestMethod("GET");
	        connection.setConnectTimeout(30000);
	        connection.connect();
	        
	        int resp = connection.getResponseCode();
	        System.out.println(resp);
			if(resp>= 200 && resp < 300) {
	        		JSONObject json = new JSONObject(new JSONTokener(connection.getInputStream()));
	        		connection.disconnect();
	        		FBUser ret = new FBUser(json);
	        		if(json == null || ret.id == null)
	        			throw new InternalException(500, "Unauthorized user");
	        		return ret;
	        }
			if(resp >= 300 || resp < 200) {
				throw new InternalException(500, "Error connecting with facebook");
			}
			connection.disconnect();
			throw new InternalException(500, "Unauthorized user");
        } catch (Exception ex) {
        		ex.printStackTrace();
        		throw new InternalException(500, "Unauthorized user");
        }
	}
}
