package co.com.compositepattern.composite;

/**
 * Esta clase es nuestra hoja o nuestro producro sencillo esta clase extiende de
 * componeteProducto y personalizamos agregando la marca del producto get
 * 
 * @author JuanC
 *
 */
public class ProductoSimple implements IComponenteProducto {

	private String marca;
	private String nombre;
	private double precio;

	/**
	 * @param nombre
	 * @param precio
	 * @param marca
	 */
	public ProductoSimple(String nombre, double precio, String marca) {
		this.precio = precio;
		this.nombre = nombre;
		this.marca = marca;
	}

	// get and set
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public void addProducto(IComponenteProducto componenteProducto) {
		throw new UnsupportedOperationException();
	}

}
