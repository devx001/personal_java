package co.com.patrones.abstractfactory;

public class Cesantias implements IProductoFinancieroFNA{

	private int totalConsignado = 93939943;
	private String nombreProducto = "Cesantias";
	
	
	@Override
	public void consultarDetalleProducto() {
		System.out.println("Nombre: "+nombreProducto+" Codigo: "+totalConsignado);
	}

}
