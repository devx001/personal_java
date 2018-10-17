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
public class CompositeProducto extends ComponenteProducto {

	private List<ComponenteProducto> product = new ArrayList<ComponenteProducto>();

	/**
	 * 
	 * @param nombre
	 */
	public CompositeProducto(String nombre) {
		super(nombre, 0);
	}

	// sobreescribimos el metodo obtener precio
	@Override
	public double getPrecio() {
		double precio = 0d;
		for (ComponenteProducto hijos : product) {
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
	public void addProducto(ComponenteProducto producto) {
		this.product.add(producto);
	}

	// eliminar producto
	public void removeProducto(ComponenteProducto producto) {
		this.product.remove(producto);
	}

	public List<ComponenteProducto> getProduct() {
		return product;
	}

	public void setProduct(List<ComponenteProducto> product) {
		this.product = product;
	}
}
