package co.com.patrones.abstractfactory;

public class ServicioFinancieroFactory extends AbstractFactory {

	@Override
	public IProductoFinancieroDavivienda getProductoDavivienda(String factoryProducto) {
		System.out.println("No puede fabricar Producto");
		return null;
	}

	@Override
	public IProductoFinancieroFNA getProductoFNA(String factoryServicio) {
		System.out.println("No puede fabricar Producto");
		return null;
	}

	@Override
	public IServicioFinancieroDavivienda getServicioDavivienda(String servicio) {
		if(servicio == null) {
			return null;
		}else if(servicio.equals("segurovida")) {
			return new SeguroVida();
		}else if(servicio.equals("pagoautomatico")) {
			return new PagoAutomatico();
		}
		return null;
	}

	

}
