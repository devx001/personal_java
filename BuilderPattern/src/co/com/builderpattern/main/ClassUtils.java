package co.com.builderpattern.main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ClassUtils {
	
	public static void main(String[] args) {
		System.out.println(getCampos(Estudiante.class));
	}
	
	static <T> List<String> getCampos(Class<T> clase) {
		List<String> listaCampos = new ArrayList<String>();
		Field[] fields = clase.getDeclaredFields();
		for (Field field : fields) {
			listaCampos.add(field.getName());
		}
		return listaCampos;
	}
	
}
