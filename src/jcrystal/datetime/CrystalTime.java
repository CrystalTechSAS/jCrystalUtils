package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalTime{
    private final java.util.Date date;
    public CrystalTime(String text)throws ParseException{
        date = DateType.TIME.FORMAT.parse(text);
    }
    public CrystalTime(long time){
        date = new java.util.Date(time);
    }
    public String format(){
        return DateType.TIME.FORMAT.format(this);
    }
    public java.util.Date toDate(){
        return date;
    }
}
