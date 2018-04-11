package jcrystal;

import java.io.PrintWriter;

public class PrintWriterUtils {

	public static void print(PrintWriter pw, String s1) {
		pw.print(s1);
	}
	public static void print(PrintWriter pw, String s1, String s2) {
		pw.print(s1);
		pw.print(s2);
	}
	public static void print(PrintWriter pw, String s1, int s2) {
		pw.print(s1);
		pw.print(s2);
	}
	public static void print(PrintWriter pw, String s1, Integer s2) {
		pw.print(s1);
		pw.print(s2);
	}
	public static void print(PrintWriter pw, String s1, long s2) {
		pw.print(s1);
		pw.print(s2);
	}
	public static void print(PrintWriter pw, String s1, Long s2) {
		pw.print(s1);
		pw.print(s2);
	}
	public static void print(PrintWriter pw, String s1, boolean s2) {
		pw.print(s1);
		pw.print(s2);
	}
	public static void print(PrintWriter pw, String s1, Boolean s2) {
		pw.print(s1);
		pw.print(s2);
	}
	public static void print(PrintWriter pw, String s1, Double s2) {
		pw.print(s1);
		pw.print(s2);
	}
	public static void print(PrintWriter pw, String s1, double s2) {
		pw.print(s1);
		pw.print(s2);
	}

	public static void print(PrintWriter pw, String s1, String s2, String s3) {
		pw.print(s1);
		pw.print(s2);
		pw.print(s3);
	}
	public static void print(PrintWriter pw, String s1, Long s2, String s3) {
		pw.print(s1);
		pw.print(s2);
		pw.print(s3);
	}
	public static void print(PrintWriter pw, String s1, long s2, String s3) {
		pw.print(s1);
		pw.print(s2);
		pw.print(s3);
	}
	public static void print(PrintWriter pw, String s1, String s2, String s3, String s4) {
		pw.print(s1);
		pw.print(s2);
		pw.print(s3);
		pw.print(s4);
	}
	
	public static boolean printJsonProp(PrintWriter pw, boolean first, String s1, String s2) {
		if(s2!=null) {
			if(!first)
				pw.print(",");
			pw.print(s1);
			pw.print(JSONUtils.jsonQuote(s2));
			return false;
		}
		return first;
	}
	public static boolean printJsonProp(PrintWriter pw, boolean first, String s1, Long s2) {
		if(s2!=null) {
			if(!first)
				pw.print(",");
			pw.print(s1);
			pw.print(JSONUtils.jsonQuote(s2));
			return false;
		}
		return first;
	}
	public static boolean printJsonProp(PrintWriter pw, boolean first, String s1, Double s2) {
		if(s2!=null) {
			if(!first)
				pw.print(",");
			pw.print(s1);
			pw.print(JSONUtils.jsonQuote(s2));
			return false;
		}
		return first;
	}
	public static boolean printJsonProp(PrintWriter pw, boolean first, String s1, Integer s2) {
		if(s2!=null) {
			if(!first)
				pw.print(",");
			pw.print(s1);
			pw.print(JSONUtils.jsonQuote(s2));
			return false;
		}
		return first;
	}
	public static boolean printJsonProp(PrintWriter pw, boolean first, String s1, Boolean s2) {
		if(s2!=null) {
			if(!first)
				pw.print(",");
			pw.print(s1);
			pw.print(JSONUtils.jsonQuote(s2));
			return false;
		}
		return first;
	}
}
