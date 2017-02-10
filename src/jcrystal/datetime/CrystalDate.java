package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
public class CrystalDate extends java.util.Date{
    public CrystalDate(String text)throws ParseException{
        super(DateType.DATE.FORMAT.parse(text).getTime());
    }
}
