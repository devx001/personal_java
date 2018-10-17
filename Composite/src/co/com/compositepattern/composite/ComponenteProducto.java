package co.com.compositepattern.composite;


/**
 * Esta clase es nuestro componente es una clase abtracta o interfaz la cual va
 * contener las caracteristicas minimas de un producto
 * 
 * @author JuanC
 */

public class ComponenteProducto {

	protected String nombre;
	protected double Precio;

	/**
	 * 
	 * @param nombre
	 * @param price
	 */
	public ComponenteProducto(String nombre, double price) {
		this.nombre = nombre;
		this.Precio = price;
	}

	// get and set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double price) {
		Precio = price;
	}

}
