package jcrystal.context;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.TransactionOptions;

public class CrystalContext {
	public static final ThreadLocal<CrystalContext> userThreadLocal = new ThreadLocal<>();
	public static void set() {
		userThreadLocal.set(new CrystalContext());
	}
	public static void clear() {
		userThreadLocal.remove();
	}
	public static CrystalContext get() {
		CrystalContext ret = userThreadLocal.get();
		if(ret == null)
			userThreadLocal.set(ret = new CrystalContext());
		return ret;
	}
	
	public final com.google.appengine.api.datastore.DatastoreService datastore = com.google.appengine.api.datastore.DatastoreServiceFactory.getDatastoreService();
	private com.google.appengine.api.datastore.Transaction txn;
    
	public final com.google.appengine.api.datastore.Transaction getTxn(){
		if(txn == null)
			txn = datastore.beginTransaction(TransactionOptions.Builder.withXG(true));
		return txn;
	}
    public final void endTx(){
    	txn.commit();
    }
    public final boolean rollbackTx(){
        if(txn.isActive()) {
            txn.rollback();
            return false;
        }
        return true;
    }
    public final void delete(Key...keys){
        datastore.delete(txn, keys);
    }
}
