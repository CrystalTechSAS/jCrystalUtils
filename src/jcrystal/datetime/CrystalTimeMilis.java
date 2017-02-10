package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
public class CrystalTimeMilis extends java.util.Date{
    public CrystalTimeMilis(String text)throws ParseException{
        super(DateType.TIME_MILIS.FORMAT.parse(text).getTime());
    }
}
