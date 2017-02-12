package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
@jcrystal.reflection.annotations.CrystalDate
public class CrystalDateMilis{
    private final java.util.Date date;
    public CrystalDateMilis(String text)throws ParseException{
        date = DateType.DATE_MILIS.FORMAT.parse(text);
    }
    public CrystalDateMilis(long time){
        date = new java.util.Date(time);
    }
    public String format(){
        return DateType.DATE_MILIS.FORMAT.format(this);
    }
    public java.util.Date toDate(){
        return date;
    }
}
