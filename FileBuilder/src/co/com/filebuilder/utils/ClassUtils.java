package co.com.filebuilder.utils;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

public class ClassUtils {
	
	public static Map<String, Object>  getAttributes(Object object) throws IllegalArgumentException, IllegalAccessException {
		Map<String, Object> mapAttributes = new LinkedHashMap<String, Object>();
		
		for (Field field : object.getClass().getDeclaredFields()) {
		    field.setAccessible(true); // You might want to set modifier to public first.
		    mapAttributes.put(field.getName(), field.get(object));
		}
		return mapAttributes;
	}
	
	public static boolean isNumeric(String s) {  
	    return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
	} 
}
