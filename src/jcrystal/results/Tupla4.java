package jcrystal.results;

/**
 * Created by G on 11/26/2016.
 */
public class Tupla4<E, K, P, Q> {
    public final E v0;
    public final K v1;
    public final P v2;
    public final Q v3;
    public Tupla4(E v0, K v1, P v2, Q v3){
        this.v0 = v0;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public Tupla4(Tupla3<E, K, P> v01, Q v3){
        this.v0 = v01.v0;
        this.v1 = v01.v1;
        this.v2 = v01.v2;
        this.v3 = v3;
    }
    public Tupla4(E v0, Tupla3<K, P, Q> v12){
        this.v0 = v0;
        this.v1 = v12.v0;
        this.v2 = v12.v1;
        this.v3 = v12.v2;
    }
}
