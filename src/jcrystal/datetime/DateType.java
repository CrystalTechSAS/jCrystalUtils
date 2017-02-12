package jcrystal.datetime;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public enum DateType {
    DATE_TIME("yyyyMMddHHmmX"),
    TIME("HHmmX"),
    DATE("yyyyMMddX"),
    DATE_SECONDS("yyyyMMddHHmmssX"),
    TIME_SECONDS("HHmmssX"),
    DATE_MILIS("yyyyMMddHHmmssSSSX"),
    TIME_MILIS("HmmssSSSX");

    public final SimpleDateFormat FORMATS[] = new SimpleDateFormat[24];
    public final SimpleDateFormat FORMAT;
    public final String format;
    DateType(String format){
        FORMAT = new SimpleDateFormat(this.format = format);
        FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
        for(int e = 0, i = -11; e < FORMATS.length; e++, i++){
            FORMATS[e] = new SimpleDateFormat(this.format);
            FORMATS[e].setTimeZone(TimeZone.getTimeZone("GTM"+(i>=0?"+":"") + i));
        }
    }
    static{
        generar("/Users/gasotelo/Documents/IdeaProjects/Backends/jCrystalUtils/src/", "jcrystal.datetime");
    }
    public static void generar(String path, String paquete){
        try {
            for (DateType t : DateType.values()) {
                String name = null;
                for(String h : t.name().toLowerCase().split("_"))
                    name = name == null ? h.substring(0,1).toUpperCase() + h.substring(1) : (name + h.substring(0,1).toUpperCase() + h.substring(1));
                try (PrintWriter pw = new PrintWriter(new File(new File(path, paquete.replace(".","/")), "Crystal"+name + ".java"))) {
                    pw.println("package " + paquete + ";");
                    pw.println("import java.util.*;");
                    pw.println("import java.text.ParseException;");
                    pw.println("@jcrystal.reflection.annotations.CrystalDate");
                    pw.println("public class Crystal" + name + "{");
                    pw.println("    private final java.util.Date date;");
                    pw.println("    public Crystal" + name + "(String text)throws ParseException{");
                    pw.println("        date = DateType." + t.name() + ".FORMAT.parse(text);");
                    pw.println("    }");
                    pw.println("    public Crystal" + name + "(long time){");
                    pw.println("        date = new java.util.Date(time);");
                    pw.println("    }");
                    pw.println("    public String format(){");
                    pw.println("        return DateType." + t.name() + ".FORMAT.format(this);");
                    pw.println("    }");
                    pw.println("    public java.util.Date toDate(){");
                    pw.println("        return date;");
                    pw.println("    }");
                    pw.println("}");
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
