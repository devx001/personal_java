package co.com.compositepattern.composite;

import java.util.List;

/**
 * Esta clase es nuestro componente es una clase abtracta o interfaz la cual va
 * contener las caracteristicas minimas de un producto
 * 
 * @author JuanC
 */

public interface IComponenteProducto {
	
	public double calcularPrecio();
	
	public void addProducto(IComponenteProducto componenteProducto);
	
	public List<IComponenteProducto> getProduct();
	
	public String getNombre();
	
}
