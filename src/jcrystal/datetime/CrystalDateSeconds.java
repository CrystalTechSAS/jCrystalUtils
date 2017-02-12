package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalDateSeconds{
    private final java.util.Date date;
    public CrystalDateSeconds(String text)throws ParseException{
        date = DateType.DATE_SECONDS.FORMAT.parse(text);
    }
    public CrystalDateSeconds(long time){
        date = new java.util.Date(time);
    }
    public String format(){
        return DateType.DATE_SECONDS.FORMAT.format(this);
    }
    public java.util.Date toDate(){
        return date;
    }
}
