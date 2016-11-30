package jcrystal.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JsonID {
    JsonLevel level = JsonLevel.ID;
}
