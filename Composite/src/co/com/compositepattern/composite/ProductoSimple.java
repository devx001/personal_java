package co.com.compositepattern.composite;

/**
 * Esta clase es nuestra hoja o nuestro producro sencillo esta clase extiende de
 * componeteProducto y personalizamos agregando la marca del producto get
 * 
 * @author JuanC
 *
 */
public class ProductoSimple extends ComponenteProducto {

	protected String marca;

	/**
	 * 
	 * @param nombre
	 * @param precio
	 * @param marca
	 */
	public ProductoSimple(String nombre, double precio, String marca) {
		super(nombre, precio);
		this.marca = marca;
	}

	// get and set
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
