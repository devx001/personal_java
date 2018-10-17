package co.com.singleton.main;

import co.com.singleton.controladores.Controlador1;
import co.com.singleton.controladores.Controlador2;

public class Main {
	
	public static void main(String[] args) {
		Controlador1 controlador1 = new Controlador1();
		controlador1.dividir(1,0);
		
		Controlador2 controlador2 = new Controlador2();
		controlador2.crearArchivoVacio("D:\\temp\\", "prueba.txt");
	}

}
