package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalTimeMilis{
    private final java.util.Date date;
    public CrystalTimeMilis(String text)throws ParseException{
        date = DateType.TIME_MILIS.FORMAT.parse(text);
    }
    public CrystalTimeMilis(long time){
        date = new java.util.Date(time);
    }
    public String format(){
        return DateType.TIME_MILIS.FORMAT.format(this);
    }
    public java.util.Date toDate(){
        return date;
    }
}
