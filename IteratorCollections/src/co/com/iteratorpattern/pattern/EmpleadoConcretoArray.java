/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.iteratorpattern.pattern;

public class EmpleadoConcretoArray implements IEmpleado {
	public String[] listaEmpleados = new String[4];

	// -------------------------
	public EmpleadoConcretoArray() {
		this.llenar();
	}

	// -------------------------
	@Override
	public IIterador getIterador() {
		return new IteradorConcretoArray(this);
	}

	// -------------------------
	public void llenar() {
		listaEmpleados[0] = "Mariana";
		listaEmpleados[1] = "Alejandra";
		listaEmpleados[2] = "Maria";
		listaEmpleados[3] = "Diana";
	}
}