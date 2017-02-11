package jcrystal.reflection.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by gasotelo on 2/10/17.
 */
public class Push {
    @Retention(RetentionPolicy.RUNTIME)
    public @interface PushTitle {
        String value() default "";
    }
    @Retention(RetentionPolicy.RUNTIME)
    public @interface PushBody {
        String value() default "";
    }
}
