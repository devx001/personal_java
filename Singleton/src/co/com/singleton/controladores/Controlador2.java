package co.com.singleton.controladores;

import java.io.File;

public class Controlador2 extends Controlador {
	
	public void crearArchivoVacio(String path, String nombre){
		 File file = null;
		 try {
			file = new File(path+nombre);
			if (file.createNewFile()) {
				info("Archivo Creado");
			} else {
				warning("El archivo existe");
			}
		} catch (Exception e) {
			error("Se presento un error creado el archivo: ", e);
		}
	     
	}

}
