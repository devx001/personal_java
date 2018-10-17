package co.com.chainofresponsability.pattern.handlerconcrete;

import java.math.BigDecimal;

import co.com.chainofresponsability.pattern.handler.IAprobador;

public class EjecutivoDeCuenta implements IAprobador {
	
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
		if (monto.compareTo(BigDecimal.ZERO) > 0 && monto.compareTo(new BigDecimal(10000)) <= 0) {
			System.out.println("Lo manejo yo, el ejecutivo de cuentas");
		}else{
			next.solicitudPrestamos(monto);
		}
		
	}
	
}
