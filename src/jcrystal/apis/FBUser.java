package jcrystal.apis;

public class FBUser {
	
	public String id;
	public String name;
	public String about;
	public String birthday;
	

/* FROMJSON */
	public FBUser(){
	}
	public FBUser(org.json.JSONObject json)throws org.json.JSONException{
		this.id = json.has("id")?json.getString("id"):null;
		this.name = json.has("name")?json.getString("name"):null;
		this.about = json.has("about")?json.getString("about"):null;
		this.birthday = json.has("birthday")?json.getString("birthday"):null;
	}
	public static java.util.ArrayList<FBUser> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<FBUser> ret = new java.util.ArrayList<FBUser>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new FBUser(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
/* GEN */
	public void toJson(java.io.PrintWriter _pw){
		boolean __first = true;
		_pw.print("{");
		java.lang.String val0 = id;
		if(val0 != null){
			_pw.print("\"id\":");
			_pw.print(jcrystal.JSONUtils.jsonQuote(val0));
			__first = false;
		}
		java.lang.String val1 = name;
		if(val1 != null){
			if(__first){
				_pw.print("\"name\":");
				_pw.print(jcrystal.JSONUtils.jsonQuote(val1));
				__first = false;
			}
			else{
				_pw.print(",\"name\":");
				_pw.print(jcrystal.JSONUtils.jsonQuote(val1));
			}
		}
		java.lang.String val2 = about;
		if(val2 != null){
			if(__first){
				_pw.print("\"about\":");
				_pw.print(jcrystal.JSONUtils.jsonQuote(val2));
				__first = false;
			}
			else{
				_pw.print(",\"about\":");
				_pw.print(jcrystal.JSONUtils.jsonQuote(val2));
			}
		}
		java.lang.String val3 = birthday;
		if(val3 != null){
			if(__first){
				_pw.print("\"birthday\":");
				_pw.print(jcrystal.JSONUtils.jsonQuote(val3));
				__first = false;
			}
			else{
				_pw.print(",\"birthday\":");
				_pw.print(jcrystal.JSONUtils.jsonQuote(val3));
			}
		}
		_pw.print("}");
	}
	public static void toJsonFBUser(java.io.PrintWriter _pw, java.lang.Iterable<FBUser> lista){
		_pw.print("[");
		java.util.Iterator<FBUser> iterator = lista.iterator();
		if(iterator.hasNext()){
			FBUser valor = iterator.next();
			valor.toJson(_pw);
			while(iterator.hasNext()){
				valor = iterator.next();
				_pw.print(",");
				valor.toJson(_pw);
			}
		}
		_pw.print("]");
	}
/* END */
}

