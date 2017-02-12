package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalTimeSeconds{
    private final java.util.Date date;
    public CrystalTimeSeconds(String text)throws ParseException{
        date = DateType.TIME_SECONDS.FORMAT.parse(text);
    }
    public CrystalTimeSeconds(long time){
        date = new java.util.Date(time);
    }
    public String format(){
        return DateType.TIME_SECONDS.FORMAT.format(this);
    }
    public java.util.Date toDate(){
        return date;
    }
}
