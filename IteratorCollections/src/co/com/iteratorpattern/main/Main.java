/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.iteratorpattern.main;

import co.com.iteratorpattern.pattern.EmpleadoConcreto;
import co.com.iteratorpattern.pattern.EmpleadoConcretoArray;
import co.com.iteratorpattern.pattern.EmpleadoConcretoArrayList;
import co.com.iteratorpattern.pattern.IIterador;

/**
 *
 * @author JuanC
 */
public class Main {

	public EmpleadoConcreto collectionsVector() {
		return new EmpleadoConcreto();
	}

	public EmpleadoConcretoArrayList collectionsArrayList() {
		return new EmpleadoConcretoArrayList();
	}

	public EmpleadoConcretoArray collectionsArray() {
		return new EmpleadoConcretoArray();
	}

	public static void main(String[] args) {
		try {
			Main main = new Main();
			IIterador iterador = main.collectionsArray().getIterador();
			String obj = (String) iterador.first();
			System.out.println(obj);

			iterador.next();
			iterador.next();

			System.out.println((String) iterador.current() + "\n");

			iterador.first();

			while (iterador.hasMore()) {
				System.out.println(iterador.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}