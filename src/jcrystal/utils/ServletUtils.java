package jcrystal.utils;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by G on 1/15/2017.
 */
public class ServletUtils {
    public static int optInt(HttpServletRequest req, String name, int defaultValue){
        String val = req.getParameter(name);
        if(val == null)
            return defaultValue;
        return Integer.parseInt(val);
    }
    public static Integer optInteger(HttpServletRequest req, String name){
        String val = req.getParameter(name);
        if(val == null)
            return null;
        return Integer.parseInt(val);
    }
    public static Long optLong(HttpServletRequest req, String name){
        String val = req.getParameter(name);
        if(val == null)
            return null;
        return Long.parseLong(val);
    }
    public static void sendNonAuthorizedUser(HttpServletResponse resp) throws IOException {
        resp.getWriter().print("{\"success\": 2, \"code\": 3, \"mensaje\": \"Usuario no autenticado\"}");
    }
    public static void send404(HttpServletResponse resp) throws IOException{
        resp.setStatus(404);
        resp.getWriter().print("The requested resource doesn't exists.");
    }
}