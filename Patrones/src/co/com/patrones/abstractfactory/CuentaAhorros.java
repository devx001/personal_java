package co.com.patrones.abstractfactory;

public class CuentaAhorros implements IProductoFinancieroDavivienda {
	
	private int numeroCuenta = 123456789;
	private String nombreProducto = "Cuenta Ahorros";
	
	
	@Override
	public void consultarDetalleProducto() {
		System.out.println("Nombre: "+nombreProducto+" Codigo: "+numeroCuenta);
	}
}
