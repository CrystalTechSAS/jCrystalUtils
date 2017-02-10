package jcrystal.datetime;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public enum DateType {
    DATE_TIME("yyyyMMddHHmm"),
    TIME("HHmm"),
    DATE("yyyyMMdd"),
    DATE_SECONDS("yyyyMMddHHmmss"),
    TIME_SECONDS("HHmmss"),
    DATE_MILIS("yyyyMMddHHmmssSSS"),
    TIME_MILIS("HmmssSSS");

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
        //generar("/Users/gasotelo/Documents/IdeaProjects/Backends/jCrystalUtils/src/", "jcrystal.datetime");
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
                    pw.println("public class Crystal" + name + " extends java.util.Date{");
                    pw.println("    public Crystal" + name + "(String text)throws ParseException{");
                    pw.println("        super(DateType." + t.name() + ".FORMAT.parse(text).getTime());");
                    pw.println("    }");
                    pw.println("    public String format(){");
                    pw.println("        return DateType." + t.name() + ".FORMAT.format(this);");
                    pw.println("    }");
                    pw.println("}");
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
