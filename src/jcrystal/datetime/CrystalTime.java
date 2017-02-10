package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
public class CrystalTime extends java.util.Date{
    public CrystalTime(String text)throws ParseException{
        super(DateType.TIME.FORMAT.parse(text).getTime());
    }
}
