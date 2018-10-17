package co.com.chainofresponsability.pattern.handlerconcrete;

import java.math.BigDecimal;

import co.com.chainofresponsability.pattern.handler.IAprobador;

public class Gerente implements IAprobador {
	
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
		if (monto.compareTo(new BigDecimal(50000)) > 0 && monto.compareTo(new BigDecimal(100000)) <= 0) {
			System.out.println("Lo manejo yo, el gerente");
		}else{
			next.solicitudPrestamos(monto);
		}
		
	}
	
}
