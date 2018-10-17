package co.com.patrones.abstractfactory;

public class AhorroVoluntarioContractual implements IProductoFinancieroFNA {

	private String descripcionProducto = "Permite Ahorros mes a mes durante un año";
	private String nombreProducto = "Ahorro Voluntario Contractual";
	
	
	@Override
	public void consultarDetalleProducto() {
		System.out.println("Nombre: "+nombreProducto+" Codigo: "+descripcionProducto);
	}

	
}
