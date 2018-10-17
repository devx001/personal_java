package co.com.compositepattern.main;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import co.com.compositepattern.composite.CompositeProducto;
import co.com.compositepattern.composite.IComponenteProducto;
import co.com.compositepattern.composite.ProductoSimple;

public class Main {
	
	NumberFormat formater = new DecimalFormat("###,##0.00");
	
	// PrintOrden método que imprime el detalle de la Orden en pantalla.
	public void printOrder(int orderId, String clienteVenta, IComponenteProducto compositeProducto) {
		System.out.println("\n=============================================");
		System.out.println("\nOrden: " + orderId + " Cliente: " + clienteVenta + "\nProductos comprados:");
		
		printProduct(compositeProducto);
		
		System.out.println("Total: " + formater.format(compositeProducto.calcularPrecio()));
		System.out.println("\n=============================================");
	}
	
	public void printProduct(IComponenteProducto compositeProducto) {
		for (IComponenteProducto prod : compositeProducto.getProduct()) {
			System.out.println(prod.getNombre() + "," + formater.format(prod.calcularPrecio()));
			if (prod instanceof CompositeProducto) {
				printProduct((CompositeProducto) prod);
			}
		}
	}
	
	public static void main(String[] args) {
		// Creacion de productos simples
		IComponenteProducto ram8gb = new ProductoSimple("Memoria RAM 8 GB", 1000, "KingStone");
		IComponenteProducto disk1tb = new ProductoSimple("Disco Duro 1TB", 2000, "ACME");
		IComponenteProducto cpuIntel = new ProductoSimple("Intel i7", 4500, "Intel");
		IComponenteProducto bigCabinete = new ProductoSimple("Gabinete Grande", 2200, "ExCom");
		IComponenteProducto monitor30inch = new ProductoSimple("Monitor 30'", 2000, "HP");
		IComponenteProducto gammerMouse = new ProductoSimple("Raton Gammer", 750, "Alien");
		
		IComponenteProducto gammerPC = new CompositeProducto("Gammer PC");
		gammerPC.addProducto(ram8gb);
		gammerPC.addProducto(disk1tb);
		gammerPC.addProducto(cpuIntel);
		gammerPC.addProducto(bigCabinete);
		gammerPC.addProducto(monitor30inch);
		
		IComponenteProducto pc2x1 = new CompositeProducto("Paquete PC Gammer + Casa pc");
		pc2x1.addProducto(gammerPC);
		pc2x1.addProducto(gammerMouse);
		pc2x1.calcularPrecio();
		new Main().printOrder(12345, "Juan", pc2x1);
		
	}
}
