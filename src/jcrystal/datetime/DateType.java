package jcrystal.datetime;

import java.text.SimpleDateFormat;

/**
 * Created by G on 11/14/2016.
 */
public enum DateType {
    DATETIME("yyyyMMddHHmm"),
    TIME("HHmm"),
    DATE("yyyyMMdd"),
    DATE_SECONDS("yyyyMMddHHmmss"),
    TIME_SECONDS("HHmmss"),
    DATE_MILIS("yyyyMMddHHmmssSSS"),
    TIME_MILIS("HmmssSSS");
    public final SimpleDateFormat FORMAT;
    public final String format;
    DateType(String format){
        FORMAT = new SimpleDateFormat(this.format = format);
    }
}
