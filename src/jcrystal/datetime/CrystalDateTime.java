package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalDateTime{
    public static final java.text.SimpleDateFormat SDF = new java.text.SimpleDateFormat("yyyyMMddHHmm");
    static {SDF.setTimeZone(TimeZone.getTimeZone("UTC"));}
    private final java.util.Date date;
    public CrystalDateTime(String text)throws ParseException{
        date = SDF.parse(text);
    }
    public CrystalDateTime(long time){
        date = new java.util.Date(time);
    }
    public CrystalDateTime(){
        date = new Date();
    }
    public String format(){
        return SDF.format(date);
    }
    public java.util.Date toDate(){
        return date;
    }
    public static java.util.Date toDate(CrystalDateTime cDate){
        return cDate == null ? null : cDate.date;
    }
}
