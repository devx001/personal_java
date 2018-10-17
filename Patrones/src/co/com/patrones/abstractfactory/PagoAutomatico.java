package co.com.patrones.abstractfactory;

public class PagoAutomatico implements IServicioFinancieroDavivienda {

	private int monto =  65675779;
	private String nombreServicio = "Pago Automatico";
	
	
	@Override
	public void consultarDetalleServicio() {
		System.out.println("Nombre: "+nombreServicio+" Codigo: "+monto);
	}
}
