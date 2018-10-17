package co.com.patrones.abstractfactory;

public class ProductoFinancieroFactory extends AbstractFactory{

	@Override
	public IProductoFinancieroDavivienda getProductoDavivienda(String producto) {
		if(producto == null) {
			return null;
		}else if(producto.equals("creditoconsumo")) {
			return new CreditoConsumo();
		}else if(producto.equals("cuentaahorros")) {
			return new CuentaAhorros();
		}else if(producto.equals("tarjetacredito")) {
			return new TarjetaCredito();
		}
		return null;
	}

	@Override
	public IProductoFinancieroFNA getProductoFNA(String producto) {
		if(producto == null) {
			return null;
		}else if(producto.equals("ahorrovoluntariocontractual")) {
			return new AhorroVoluntarioContractual();
		}else if(producto.equals("cesantias")) {
			return new Cesantias();
		}else if(producto.equals("creditoeducativo")) {
			return new CreditoEducativo();
		}
		
		return null;
	}

	@Override
	public IServicioFinancieroDavivienda getServicioDavivienda(String servicio) {
		System.out.println("No puede fabricar Servicio");
		return null;
	}

		

}
