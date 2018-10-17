package co.com.compositepattern.composite;

import java.util.List;

/**
 * Esta clase es nuestra hoja o nuestro producro sencillo esta clase extiende de
 * componeteProducto y personalizamos agregando la marca del producto get
 * 
 * @author JuanC
 *
 */
public class ProductoSimple implements IComponenteProducto {
	
	private String	marca;
	private String	nombre;
	private double	precio;
	
	public ProductoSimple(String nombre, double precio, String marca) {
		this.precio = precio;
		this.nombre = nombre;
		this.marca = marca;
	}
	
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
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public double calcularPrecio() {
		return precio;
	}

	@Override
	public void addProducto(IComponenteProducto componenteProducto) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<IComponenteProducto> getProduct() {
		throw new UnsupportedOperationException();
	}

}
