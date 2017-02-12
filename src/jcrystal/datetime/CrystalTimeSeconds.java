package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalTimeSeconds{
    public static final java.text.SimpleDateFormat SDF = new java.text.SimpleDateFormat("HHmmss");
    static {SDF.setTimeZone(TimeZone.getTimeZone("UTC"));}
    private final java.util.Date date;
    public CrystalTimeSeconds(String text)throws ParseException{
        date = SDF.parse(text);
    }
    public CrystalTimeSeconds(long time){
        date = new java.util.Date(time);
    }
    public CrystalTimeSeconds(){
        date = new Date();
    }
    public String format(){
        return SDF.format(date);
    }
    public java.util.Date toDate(){
        return date;
    }
    public static java.util.Date toDate(CrystalTimeSeconds cDate){
        return cDate == null ? null : cDate.date;
    }
}
