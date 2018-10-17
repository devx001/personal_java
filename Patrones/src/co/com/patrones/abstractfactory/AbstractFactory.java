package co.com.patrones.abstractfactory;

public abstract class AbstractFactory {

	public abstract IProductoFinancieroDavivienda getProductoDavivienda(String producto);
	public abstract IProductoFinancieroFNA getProductoFNA(String producto);
	public abstract IServicioFinancieroDavivienda getServicioDavivienda(String servicio);
	
}
