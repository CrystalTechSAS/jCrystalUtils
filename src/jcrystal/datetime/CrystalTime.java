package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalTime{
    public static final java.text.SimpleDateFormat SDF = new java.text.SimpleDateFormat("HHmm");
    static {SDF.setTimeZone(TimeZone.getTimeZone("UTC"));}
    private final java.util.Date date;
    public CrystalTime(String text)throws ParseException{
        date = SDF.parse(text);
    }
    public CrystalTime(long time){
        date = new java.util.Date(time);
    }
    public CrystalTime(){
        date = new Date();
    }
    public String format(){
        return SDF.format(date);
    }
    public java.util.Date toDate(){
        return date;
    }
    public static java.util.Date toDate(CrystalTime cDate){
        return cDate == null ? null : cDate.date;
    }
}
