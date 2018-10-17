package co.com.chainpattern.handlerconcrete;

import co.com.chainpattern.handler.IAprobador;
import co.com.chainpattern.logica.Solicitud;

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
	public void solicitudPrestamos(Solicitud solicitud) throws Exception {
		EjecutivoDeCuenta ejecutivo = new EjecutivoDeCuenta();
		LiderEjecutivo liderEjecutivo = new LiderEjecutivo();
		Gerente gerente = new Gerente();
		Director director = new Director();
		Vicepresidente vicepresidente= new Vicepresidente();
		
		ejecutivo.setNext(liderEjecutivo);
		liderEjecutivo.setNext(gerente);
		gerente.setNext(director);
		director.setNext(vicepresidente);
		ejecutivo.solicitudPrestamos(solicitud);
	}
	
}
