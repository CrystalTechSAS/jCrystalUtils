package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
public class CrystalTimeSeconds extends java.util.Date{
    public CrystalTimeSeconds(String text)throws ParseException{
        super(DateType.TIME_SECONDS.FORMAT.parse(text).getTime());
    }
}
