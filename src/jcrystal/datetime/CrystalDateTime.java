package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
public class CrystalDateTime extends java.util.Date{
    public CrystalDateTime(String text)throws ParseException{
        super(DateType.DATE_TIME.FORMAT.parse(text).getTime());
    }
}
