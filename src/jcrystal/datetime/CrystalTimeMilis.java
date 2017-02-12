package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalTimeMilis{
    public static final java.text.SimpleDateFormat SDF = new java.text.SimpleDateFormat("HmmssSSS");
    static {SDF.setTimeZone(TimeZone.getTimeZone("UTC"));}
    private final java.util.Date date;
    public CrystalTimeMilis(String text)throws ParseException{
        date = SDF.parse(text);
    }
    public CrystalTimeMilis(long time){
        date = new java.util.Date(time);
    }
    public CrystalTimeMilis(){
        date = new Date();
    }
    public String format(){
        return SDF.format(date);
    }
    public java.util.Date toDate(){
        return date;
    }
    public static java.util.Date toDate(CrystalTimeMilis cDate){
        return cDate == null ? null : cDate.date;
    }
}
