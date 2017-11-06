package jcrystal;

import java.util.function.Supplier;

public class InternalJCrystalConfig {
	public static String SUCCESS_NAME = "success";
	public static Class<?> SUCCESS_TYPE = int.class;
	public static String ERROR_MESSAGE_NAME = "mensaje";
	public static String SUCCESS_CONDITION = SUCCESS_NAME+" == 1";
	public static String ERROR_CONDITION = SUCCESS_NAME+" == 2";
	public static String UNATHORIZED_CONDITION = SUCCESS_NAME+" == 3";

}
