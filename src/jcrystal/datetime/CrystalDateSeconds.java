package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
public class CrystalDateSeconds extends java.util.Date{
    public CrystalDateSeconds(String text)throws ParseException{
        super(DateType.DATE_SECONDS.FORMAT.parse(text).getTime());
    }
}
