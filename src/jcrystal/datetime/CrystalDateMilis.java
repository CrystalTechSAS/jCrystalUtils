package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalDateMilis{
    public static final java.text.SimpleDateFormat SDF = new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS");
    static {SDF.setTimeZone(TimeZone.getTimeZone("UTC"));}
    private final java.util.Date date;
    public CrystalDateMilis(String text)throws ParseException{
        date = SDF.parse(text);
    }
    public CrystalDateMilis(long time){
        date = new java.util.Date(time);
    }
    public CrystalDateMilis(){
        date = new Date();
    }
    public String format(){
        return SDF.format(date);
    }
    public java.util.Date toDate(){
        return date;
    }
    public static java.util.Date toDate(CrystalDateMilis cDate){
        return cDate == null ? null : cDate.date;
    }
}
