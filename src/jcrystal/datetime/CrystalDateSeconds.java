package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalDateSeconds{
    public static final java.text.SimpleDateFormat SDF = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
    static {SDF.setTimeZone(TimeZone.getTimeZone("UTC"));}
    private final java.util.Date date;
    public CrystalDateSeconds(String text)throws ParseException{
        date = SDF.parse(text);
    }
    public CrystalDateSeconds(long time){
        date = new java.util.Date(time);
    }
    public CrystalDateSeconds(){
        date = new Date();
    }
    public String format(){
        return SDF.format(date);
    }
    public java.util.Date toDate(){
        return date;
    }
    public static java.util.Date toDate(CrystalDateSeconds cDate){
        return cDate == null ? null : cDate.date;
    }
}
