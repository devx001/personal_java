package co.com.patrones.abstractfactory;

public class FabricaDeFabricas {

	public static AbstractFactory getFactory(String fabrica) {
		if(fabrica == null) {
			return null;
		}else if(fabrica.equals("producto")) {
			return new ProductoFinancieroFactory();
		}else if(fabrica.equals("servicio")) {
			return new ServicioFinancieroFactory();
		}
		return null;
	}
	
}
