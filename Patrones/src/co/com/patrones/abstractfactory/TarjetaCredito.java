package co.com.patrones.abstractfactory;

public class TarjetaCredito implements IProductoFinancieroDavivienda{
	
	private int codigoProducto = 100;
	private String nombreProducto = "Tarjeta Credito";
	
	
	@Override
	public void consultarDetalleProducto() {
		System.out.println("Nombre: "+nombreProducto+" Codigo: "+codigoProducto);
	}

}
