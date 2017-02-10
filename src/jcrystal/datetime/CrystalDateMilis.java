package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
public class CrystalDateMilis extends java.util.Date{
    public CrystalDateMilis(String text)throws ParseException{
        super(DateType.DATE_MILIS.FORMAT.parse(text).getTime());
    }
}
