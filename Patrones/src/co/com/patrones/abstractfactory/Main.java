package co.com.patrones.abstractfactory;

public class Main {

	public static void main(String[] args) {
		
		AbstractFactory fabricaProducto = FabricaDeFabricas.getFactory("producto");
		IProductoFinancieroDavivienda productoDavicienda = fabricaProducto.getProductoDavivienda("cuentaahorros");
		productoDavicienda.consultarDetalleProducto();
		
		AbstractFactory fabricaServicio = FabricaDeFabricas.getFactory("servicio");
		IServicioFinancieroDavivienda servicioDavivienda = fabricaServicio.getServicioDavivienda("segurovida");
		servicioDavivienda.consultarDetalleServicio();
		

	}

}
