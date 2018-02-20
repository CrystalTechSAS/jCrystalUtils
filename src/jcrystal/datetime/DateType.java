package jcrystal.datetime;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public enum DateType {
	DATE_TIME("yyyyMMddHHmm"),
    TIME("HHmm"),
    DATE("yyyyMMddHHmm"),
    DATE_SECONDS("yyyyMMddHHmmss"),
    TIME_SECONDS("HHmmss"),
    DATE_MILIS("yyyyMMddHHmmssSSS"),
    TIME_MILIS("HmmssSSS");

    public final SimpleDateFormat FORMAT;
    public String format;
    DateType(String format){
        FORMAT = new SimpleDateFormat(this.format = format);
        FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
