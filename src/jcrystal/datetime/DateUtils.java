package jcrystal.datetime;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * Created by G on 11/30/2016.
 */
public class DateUtils {
    public static SimpleDateFormat createFormat(String format, String timeZone){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
        return sdf;
    }
}
