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
	
	private List<IComponenteProducto>	product	= new ArrayList<IComponenteProducto>();
	private String						nombre;
	
	public CompositeProducto(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public double calcularPrecio() {
		double precio = 0d;
		for (IComponenteProducto hijos : product) {
			precio += hijos.calcularPrecio();
		}
		
		return precio;
	}
	
	public void addProducto(IComponenteProducto producto) {
		this.product.add(producto);
	}
	
	public void removeProducto(IComponenteProducto producto) {
		this.product.remove(producto);
	}
	
	public void setProduct(List<IComponenteProducto> product) {
		this.product = product;
	}
	
	@Override
	public List<IComponenteProducto> getProduct() {
		return product;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
