package co.com.proxypattern.logica;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Utils {
	
	private static final String rutaJson = "/home/juanc/temp/proxy.json";
	
	public static List<Media> lecturaJson() throws Exception {
		File f = new File(rutaJson);
		List<Media> recetas = null;
		FileReader datosJson = null;
		if (f.exists()) {
			try {
				datosJson = new FileReader(rutaJson);
				Type type = new TypeToken<ArrayList<Media>>() {
				}.getType();
				recetas = new Gson().fromJson(datosJson, type);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				datosJson.close();
			}
		}
		if (recetas == null) {
			recetas = new ArrayList<Media>();
		}
		return recetas;
	}
}
