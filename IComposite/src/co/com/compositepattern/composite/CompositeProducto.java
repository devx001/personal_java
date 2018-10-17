package co.com.compositepattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * nuesta clase composite la que va a permitir almacenar nuestros productos
 * simples
 * 
 * sobre escrito para regresar el precio de todos los productos que contiene y
 * el método setPrecio cambioamos para que no se sobreescrita para que no nos
 * permita establecer un precio, de esta forma cumplimos la regla de que el
 * precio de un paquete es la suma del precio de todos los productos que
 * contiene.
 * 
 * @author JuanC
 *
 */
public class CompositeProducto implements IComponenteProducto {

	private List<IComponenteProducto> product = new ArrayList<IComponenteProducto>();
	private String nombre;
	
	/**
	 * 
	 * @param nombre
	 */
	public CompositeProducto(String nombre) {
		this.nombre = nombre;
	}

	// sobreescribimos el metodo obtener precio
	@Override
	public double getPrecio() {
		double precio = 0d;
		for (IComponenteProducto hijos : product) {
			precio += hijos.getPrecio();
		}

		return precio;
	}

	// lo establecemos de esta manera para que no se pueda establecer un precio
	// para cumplir la regla se la suma de un paquete es la suma del precio de
	// todos los productos que contien
	@Override
	public void setPrecio(double price) {
		throw new UnsupportedOperationException();
	}

	// agregar producto
	public void addProducto(IComponenteProducto producto) {
		this.product.add(producto);
	}

	// eliminar producto
	public void removeProducto(IComponenteProducto producto) {
		this.product.remove(producto);
	}

	public List<IComponenteProducto> getProduct() {
		return product;
	}

	public void setProduct(List<IComponenteProducto> product) {
		this.product = product;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
