package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalDateTime{
    private final java.util.Date date;
    public CrystalDateTime(String text)throws ParseException{
        date = DateType.DATE_TIME.FORMAT.parse(text);
    }
    public CrystalDateTime(long time){
        date = new java.util.Date(time);
    }
    public String format(){
        return DateType.DATE_TIME.FORMAT.format(this);
    }
    public java.util.Date toDate(){
        return date;
    }
}
