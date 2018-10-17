package co.com.patrones.abstractfactory;

public class CreditoEducativo implements IProductoFinancieroFNA{

	private String descripcionProducto = "Ofrece credito para estudiar";
	private String nombreProducto = "Credito Educativo";
	
	
	@Override
	public void consultarDetalleProducto() {
		System.out.println("Nombre: "+nombreProducto+" Codigo: "+descripcionProducto);
	}

}
