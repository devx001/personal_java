package co.com.filebuilder.main;

import java.util.ArrayList;
import java.util.List;

import co.com.filebuilder.builder.JSONBuilder;
import co.com.filebuilder.builder.XMLBuilder;
import co.com.filebuilder.director.FileDirector;
import co.com.filebuilder.pojo.Asignatura;
import co.com.filebuilder.pojo.Estudiante;

public class Main {

	public static void main(String[] args) {
		try {
			List<Estudiante> listEstudiante = new ArrayList<Estudiante>();
			
			Estudiante estudiante = new Estudiante();
			estudiante.setNombre("Juan");
			estudiante.setApellidos("Pedraza");
			
			Asignatura asignatura = new Asignatura();
			asignatura.setCodigo("1212132");
			asignatura.setNombre("Arquitectura de software");
			asignatura.setSemestre("8");
			
			Estudiante estudiante2 = new Estudiante();
			estudiante2.setNombre("Carlos");
			estudiante2.setApellidos("Pedraza");
			
			listEstudiante.add(estudiante);
			listEstudiante.add(estudiante2);
			
			FileDirector director = new FileDirector(new JSONBuilder());
			System.out.println(director.constructFileList(listEstudiante));
			System.out.println(director.constructFileObject(estudiante2));
			
			System.out.println(director.constructFileObject(asignatura));
			
			director = new FileDirector(new XMLBuilder());
			System.out.println(director.constructFileList(listEstudiante));
			System.out.println(director.constructFileObject(estudiante2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
