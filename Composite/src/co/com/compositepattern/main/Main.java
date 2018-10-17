package co.com.compositepattern.main;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import co.com.compositepattern.composite.ComponenteProducto;
import co.com.compositepattern.composite.CompositeProducto;
import co.com.compositepattern.composite.ProductoSimple;

public class Main {
	
	NumberFormat formater = new DecimalFormat("###,##0.00");
	
	// PrintOrden método que imprime el detalle de la Orden en pantalla.
	public void printOrder(int orderId, String clienteVenta, CompositeProducto compositeProducto) {
		System.out.println("\n=============================================");
		System.out.println("\nOrden: " + orderId + " Cliente: " + clienteVenta + "\nProductos comprados:");
		
		printProduct(compositeProducto);

		System.out.println("Total: " + formater.format(compositeProducto.getPrecio()));
		System.out.println("\n=============================================");
	}
	
	public void printProduct(CompositeProducto compositeProducto) {
		for (ComponenteProducto prod : compositeProducto.getProduct()) {
				System.out.println(prod.getNombre() + "," + formater.format(prod.getPrecio()));
			if(prod instanceof CompositeProducto) {
				printProduct((CompositeProducto) prod);
			}
		}
	}
	
	public static void main(String[] args) {
		// Creacion de productos simples
		ProductoSimple ram4gb = new ProductoSimple("Memoria RAM 4GB", 780, "KingStone");
		ProductoSimple ram8gb = new ProductoSimple("Memoria RAM 8 GB", 1000, "KingStone");

		ProductoSimple disk500gb = new ProductoSimple("Disco Duro 500GB", 1500, "ACME");
		ProductoSimple disk1tb = new ProductoSimple("Disco Duro 1TB", 2000, "ACME");

		ProductoSimple cpuAMD = new ProductoSimple("AMD phenon", 4000, "AMD");
		ProductoSimple cpuIntel = new ProductoSimple("Intel i7", 4500, "Intel");

		ProductoSimple smallCabinete = new ProductoSimple("Gabinete Pequeño", 2000, "ExCom");
		ProductoSimple bigCabinete = new ProductoSimple("Gabinete Grande", 2200, "ExCom");

		ProductoSimple monitor20inch = new ProductoSimple("Monitor 20'", 1500, "HP");
		ProductoSimple monitor30inch = new ProductoSimple("Monitor 30'", 2000, "HP");

		ProductoSimple simpleMouse = new ProductoSimple("Raton Simple", 150, "Genius");
		ProductoSimple gammerMouse = new ProductoSimple("Raton Gammer", 750, "Alien");

		// Computadora para Gammer que incluye 16gb de ram,disco de 1tb,
		// procesador
		// Intel i7
		// gabinete grande,monitor de 30' y un mouse gammer.
		CompositeProducto gammerPC = new CompositeProducto("Gammer PC");
		gammerPC.addProducto(ram8gb);
		gammerPC.addProducto(disk1tb);
		gammerPC.addProducto(cpuIntel);
		gammerPC.addProducto(bigCabinete);
		gammerPC.addProducto(monitor30inch);

		// Computadora para Casa que incluye 4gb de ram,disco de 500gb,
		// procesador AMD Phenon
		// gabinete chico,monitor de 20' y un mouse simple.
		CompositeProducto homePC = new CompositeProducto("Casa PC");
		homePC.addProducto(ram4gb);//
		homePC.addProducto(disk500gb);
		homePC.addProducto(cpuAMD);
		homePC.addProducto(smallCabinete);
		homePC.addProducto(monitor20inch);
		homePC.addProducto(simpleMouse);

		CompositeProducto pc2x1 = new CompositeProducto("Paquete PC Gammer + Casa pc");
		pc2x1.addProducto(gammerPC);
		pc2x1.addProducto(gammerMouse);
		pc2x1.getPrecio();
		new Main().printOrder(12345, "Juan", pc2x1);

//		// imnprimiendo ventas
//		Ventas gammerOrder = new Ventas(1, "Juan Perez");
//		gammerOrder.addProducto(gammerPC);
//		gammerOrder.printOrder();
//
//		Ventas homeOrder = new Ventas(2, "Marcos Guerra");
//		homeOrder.addProducto(homePC);
//		homeOrder.printOrder();
//
//		Ventas comboOrder = new Ventas(3, "Paquete 2x1 en PC");
//		comboOrder.addProducto(pc2x1);
//		comboOrder.printOrder();
//
//		Ventas customOrder = new Ventas(4, "Oscar Blancarte");
//		customOrder.addProducto(homePC);
//		customOrder.addProducto(ram8gb);
//		customOrder.addProducto(ram4gb);
//		customOrder.addProducto(monitor30inch);
//		customOrder.addProducto(gammerMouse);
//		customOrder.printOrder();

	}
}
