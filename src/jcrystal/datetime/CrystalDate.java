package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalDate{
    private final java.util.Date date;
    public CrystalDate(String text)throws ParseException{
        date = DateType.DATE.FORMAT.parse(text);
    }
    public CrystalDate(long time){
        date = new java.util.Date(time);
    }
    public String format(){
        return DateType.DATE.FORMAT.format(this);
    }
    public java.util.Date toDate(){
        return date;
    }
}
