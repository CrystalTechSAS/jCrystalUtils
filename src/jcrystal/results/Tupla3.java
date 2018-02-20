package jcrystal.results;

/**
 * Created by G on 11/26/2016.
 */
public class Tupla3<E, K, P> {
    public final E v0;
    public final K v1;
    public final P v2;
    public Tupla3(E v0, K v1, P v2){
        this.v0 = v0;
        this.v1 = v1;
        this.v2 = v2;
    }
    public Tupla3(Tupla2<E, K> v01, P v2){
        this.v0 = v01.v0;
        this.v1 = v01.v1;
        this.v2 = v2;
    }
    public Tupla3(E v0, Tupla2<K, P> v12){
        this.v0 = v0;
        this.v1 = v12.v0;
        this.v2 = v12.v1;
    }
    public <Q> Tupla4<E, K, P, Q> append(Q q){
		return new Tupla4<E, K, P, Q>(v0, v1, v2, q);
    }
}
