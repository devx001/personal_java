package co.com.chainofresponsability.pattern.main;

import java.math.BigDecimal;

public class Main {
	
	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.solicitudPrestamos(new BigDecimal(51000));
		
		banco.solicitudPrestamos(new BigDecimal(1000));
		
		banco.solicitudPrestamos(new BigDecimal(20000));
		
		banco.solicitudPrestamos(new BigDecimal(1200000));
	}
	
}
