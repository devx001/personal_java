package co.com.chainofresponsability.pattern.main;

import java.math.BigDecimal;

import co.com.chainofresponsability.pattern.handler.IAprobador;
import co.com.chainofresponsability.pattern.handlerconcrete.Director;
import co.com.chainofresponsability.pattern.handlerconcrete.EjecutivoDeCuenta;
import co.com.chainofresponsability.pattern.handlerconcrete.Gerente;
import co.com.chainofresponsability.pattern.handlerconcrete.LiderEjecutivo;

public class Banco implements IAprobador {
	
	private IAprobador next;
	
	@Override
	public void setNext(IAprobador aprobador) {
		next = aprobador;
	}
	
	@Override
	public IAprobador getNext() {
		return next;
	}
	
	@Override
	public void solicitudPrestamos(BigDecimal monto) {
		EjecutivoDeCuenta ejecutivo = new EjecutivoDeCuenta();
		LiderEjecutivo liderEjecutivo = new LiderEjecutivo();
		Gerente gerente = new Gerente();
		Director director = new Director();
		
		ejecutivo.setNext(liderEjecutivo);
		liderEjecutivo.setNext(gerente);
		gerente.setNext(director);
		ejecutivo.solicitudPrestamos(monto);
		
//		this.setNext().setNext(new LiderEjecutivo()).setNext(new Gerente()).setNext(new Director());
//		next.solicitudPrestamos(monto);
	}
	
}
