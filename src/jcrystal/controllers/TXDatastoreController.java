package jcrystal.controllers;

import com.google.appengine.api.datastore.*;

/**
 * Created by gasotelo on 2/28/17.
 *
 */
public class TXDatastoreController {
    protected com.google.appengine.api.datastore.DatastoreService $datastore = com.google.appengine.api.datastore.DatastoreServiceFactory.getDatastoreService();
    protected com.google.appengine.api.datastore.Transaction $txn;
    public final void startTx(){
        $txn = $datastore.beginTransaction(TransactionOptions.Builder.withXG(true));
    }
    public final void endTx(){
        $txn.commit();
    }
    public final boolean rollbackTx(){

        if($txn.isActive()) {
            $txn.rollback();
            return true;
        }
        return false;
    }
    public final Entity get(Key key) throws EntityNotFoundException {
        return $datastore.get($txn, key);
    }
    public final Key put(Entity ent){
        return $datastore.put($txn, ent);
    }
    public final void delete(Key...keys){
        $datastore.delete($txn, keys);
    }

}
