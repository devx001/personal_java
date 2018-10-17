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

public class IteradorConcreto implements IIterador {
	private EmpleadoConcreto empleado;
	private int posicion_actual = 0;

	public IteradorConcreto(EmpleadoConcreto empleado) {
		this.empleado = empleado;
	}

	@Override
	public Object primero() {
		Object obj = null;
		if (this.empleado.listaEmpleados.isEmpty() == false) {
			this.posicion_actual = 0;
			obj = this.empleado.listaEmpleados.firstElement();
		}
		return obj;
	}

	@Override
	public Object siguiente() {
		Object obj = null;
		if ((this.posicion_actual) < this.empleado.listaEmpleados.size()) {
			obj = this.empleado.listaEmpleados.elementAt(this.posicion_actual);
			this.posicion_actual = this.posicion_actual + 1;
		}
		return obj;
	}

	@Override
	public boolean hayMas() {
		boolean ok = false;
		if (this.posicion_actual < (this.empleado.listaEmpleados.size())) {
			ok = true;
		}
		return ok;
	}

	@Override
	public Object actual() {
		Object obj = null;
		if (this.posicion_actual < this.empleado.listaEmpleados.size()) {
			obj = this.empleado.listaEmpleados.elementAt(this.posicion_actual);
		}
		return obj;
	}
}