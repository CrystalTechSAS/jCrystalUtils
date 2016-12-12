package jcrystal.datetime;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.TimeZone;

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
