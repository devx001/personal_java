package co.com.chainpattern.handler;

import co.com.chainpattern.logica.Solicitud;

public interface IAprobador {
	
	public void setNext (IAprobador aprobador);
	
	public IAprobador getNext();
	
	public void solicitudPrestamos(Solicitud solicitud) throws Exception;
	
}
