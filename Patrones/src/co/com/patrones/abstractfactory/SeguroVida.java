package co.com.patrones.abstractfactory;

public class SeguroVida implements IServicioFinancieroDavivienda{

	private String descripcion = "Es para una cuenta de ahorros";
	private String nombreServicio = "Seguro Vida";
	
	
	@Override
	public void consultarDetalleServicio() {
		System.out.println("Nombre: "+nombreServicio+" Codigo: "+descripcion);
	}

}
