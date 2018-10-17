/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.iteratorpattern.pattern;

/**
 *
 * @author JuanC
 */
import java.util.Vector;

public class EmpleadoConcreto implements IEmpleado {
	public Vector listaEmpleados = new Vector();

	// -------------------------
	public EmpleadoConcreto() {
		this.llenar();
	}

	// -------------------------
	@Override
	public IIterador getIterador() {
		return new IteradorConcreto(this);
	}

	// -------------------------
	public void llenar() {
		this.listaEmpleados.add(new String("Jose"));
		this.listaEmpleados.add(new String("Luis"));
		this.listaEmpleados.add(new String("Jesus"));
		this.listaEmpleados.add(new String("Alejandra"));
	}
}