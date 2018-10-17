package co.com.compositepattern.composite;

/**
 * Esta clase es nuestro componente es una clase abtracta o interfaz la cual va
 * contener las caracteristicas minimas de un producto
 * 
 * @author JuanC
 */

public interface IComponenteProducto {
	
	public String getNombre();
	
	public void setNombre(String nombre);
	
	public double getPrecio();
	
	public void setPrecio(double price);
	
	public void addProducto(IComponenteProducto componenteProducto);
	
}
