package jcrystal.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface Predicado<T> {
    public boolean eval(T elemento);
}
