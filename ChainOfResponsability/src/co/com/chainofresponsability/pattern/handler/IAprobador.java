package co.com.chainofresponsability.pattern.handler;

import java.math.BigDecimal;

public interface IAprobador {
	
	public void setNext (IAprobador aprobador);
	
	public IAprobador getNext();
	
	public void solicitudPrestamos(BigDecimal monto);
	
}
