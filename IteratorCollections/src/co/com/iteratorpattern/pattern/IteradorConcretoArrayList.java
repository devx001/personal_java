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

public class IteradorConcretoArrayList implements IIterador { 
	private EmpleadoConcretoArrayList empleado;
	private int posicion_actual = 0;

	public IteradorConcretoArrayList(EmpleadoConcretoArrayList empleado) {
		this.empleado = empleado;
	}

	@Override
	public Object first() {
		Object obj = null;
		if (this.empleado.listaEmpleados.isEmpty() == false) {
			this.posicion_actual = 0;
			obj = this.empleado.listaEmpleados.get(0);
		}
		return obj;
	}

	@Override
	public Object next() {
		Object obj = null;
		if ((this.posicion_actual) < this.empleado.listaEmpleados.size()) {
			obj = this.empleado.listaEmpleados.get(this.posicion_actual);
			this.posicion_actual = this.posicion_actual + 1;
		}
		return obj;
	}

	@Override
	public boolean hasMore() {
		boolean ok = false;
		if (this.posicion_actual < (this.empleado.listaEmpleados.size())) {
			ok = true;
		}
		return ok;
	}

	@Override
	public Object current() {
		Object obj = null;
		if (this.posicion_actual < this.empleado.listaEmpleados.size()) {
			obj = this.empleado.listaEmpleados.get(this.posicion_actual);
		}
		return obj;
	}
}