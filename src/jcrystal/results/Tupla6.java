package jcrystal.results;

/**
 * Created by G on 11/26/2016.
 */
public class Tupla6<E, K, P, Q, L, M> {
    public final E v0;
    public final K v1;
    public final P v2;
    public final Q v3;
    public final L v4;
    public final M v5;
    public Tupla6(E v0, K v1, P v2, Q v3, L v4, M v5){
        this.v0 = v0;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.v5 = v5;
    }
    public Tupla6(Tupla3<E,K,P> v01, Q v3, L v4, M v5){
    		this.v0 = v01.v0;
        this.v1 = v01.v1;
        this.v2 = v01.v2;
        this.v3 = v3;
        this.v4 = v4;
        this.v5 = v5;
    }
    public Tupla6(E v0, Tupla3<K,P,Q> v12, L v4, M v5){
		this.v0 = v0;
	    this.v1 = v12.v0;
	    this.v2 = v12.v1;
	    this.v3 = v12.v2;
	    this.v4 = v4;
	    this.v5 = v5;
	}
    public Tupla6(Tupla5<E, K, P, Q, L> v01, M v5){
        this.v0 = v01.v0;
        this.v1 = v01.v1;
        this.v2 = v01.v2;
        this.v3 = v01.v3;
        this.v4 = v01.v4;
        this.v5 = v5;
    }
    public Tupla6(E v0, Tupla5<K, P, Q, L, M> v12){
        this.v0 = v0;
        this.v1 = v12.v0;
        this.v2 = v12.v1;
        this.v3 = v12.v2;
        this.v4 = v12.v3;
        this.v5 = v12.v4;
    }
}
