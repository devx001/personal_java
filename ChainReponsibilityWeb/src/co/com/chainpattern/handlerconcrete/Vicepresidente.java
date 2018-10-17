package co.com.chainpattern.handlerconcrete;

import java.math.BigDecimal;

import co.com.chainpattern.handler.IAprobador;
import co.com.chainpattern.logica.Solicitud;
import co.com.chainpattern.logica.Utils;

public class Vicepresidente implements IAprobador {
	
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
	public void solicitudPrestamos(Solicitud solicitud) throws Exception{
		if (solicitud.getMonto().compareTo(new BigDecimal(500000)) > 0) {
			System.out.println("Lo manejo yo, el vicepresidente");
			solicitud.setMailAprobador("juanc.pedrazad@gmail.com");
			Utils.enviarMail(solicitud);
		}
	}
	
}
