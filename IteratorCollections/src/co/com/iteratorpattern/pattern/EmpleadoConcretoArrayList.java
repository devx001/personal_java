/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.iteratorpattern.pattern;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoConcretoArrayList implements IEmpleado {
	public List<String> listaEmpleados = new ArrayList<String>();
 
	// -------------------------
	public EmpleadoConcretoArrayList() {
		this.llenar();
	}

	// -------------------------
	@Override
	public IIterador getIterador() {
		return new IteradorConcretoArrayList(this);
	}

	// -------------------------
	public void llenar() {
		this.listaEmpleados.add("Pedro");
		this.listaEmpleados.add("Daniel");
		this.listaEmpleados.add("Alvaro");
		this.listaEmpleados.add("Daniela");
	}
}