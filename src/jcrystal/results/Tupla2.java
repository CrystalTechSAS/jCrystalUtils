package jcrystal.results;

/**
 * Created by G on 11/26/2016.
 */
public class Tupla2<E, K> {
    public final E v0;
    public final K v1;
    public Tupla2(E v0, K v1){
        this.v0 = v0;
        this.v1 = v1;
    }
    public <P> Tupla3<E, K, P> append(P p){
    		return new Tupla3<E, K, P>(v0, v1 , p);
    }
    
    
}
