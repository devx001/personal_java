package co.com.patrones.abstractfactory;

public class CreditoConsumo implements IProductoFinancieroDavivienda{

	private int numeroCredito = 1234567;
	private String nombreCredito = "Credito Consumo";
	
	
	@Override
	public void consultarDetalleProducto() {
		System.out.println("Nombre: "+nombreCredito+" Codigo: "+numeroCredito);
	}
}
