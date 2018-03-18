package jcrystal.results;

/**
 * Created by G on 11/26/2016.
 */
public class Tupla5<E, K, P, Q, L> {
    public final E v0;
    public final K v1;
    public final P v2;
    public final Q v3;
    public final L v4;
    public Tupla5(E v0, K v1, P v2, Q v3, L v4){
        this.v0 = v0;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }
    public Tupla5(Tupla4<E, K, P, Q> v01, L v4){
        this.v0 = v01.v0;
        this.v1 = v01.v1;
        this.v2 = v01.v2;
        this.v3 = v01.v3;
        this.v4 = v4;
    }
    public Tupla5(E v0, Tupla4<K, P, Q, L> v12){
        this.v0 = v0;
        this.v1 = v12.v0;
        this.v2 = v12.v1;
        this.v3 = v12.v2;
        this.v4 = v12.v3;
    }
}
