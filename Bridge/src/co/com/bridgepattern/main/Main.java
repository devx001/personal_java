package co.com.bridgepattern.main;

import co.com.bridgepattern.bridge.AlphabeticList;
import co.com.bridgepattern.bridge.BaseList;
import co.com.bridgepattern.bridge.EnumeratedList;
import co.com.bridgepattern.bridge.VignetteList;
import co.com.bridgepattern.def.IList;
import co.com.bridgepattern.impl.ImplRepeatList;
import co.com.bridgepattern.impl.ImplUniqueList;

/**
 *
 * @author JuanC
 */

public class Main {

	public void metodoUno() {
		IList implementation = new ImplRepeatList();
		BaseList baselist = new BaseList();
		baselist.setImplementation(implementation);

		for (int i = 0; i < 10; i++) {
			baselist.addItem("Test "+i);
		}
		
		EnumeratedList enumeratedList = new EnumeratedList();
		enumeratedList.setImplementation(implementation);

		VignetteList vignetteList = new VignetteList();
		vignetteList.setImplementation(implementation);
		vignetteList.setItemType('+');

		System.out.println("Lista Base");
		for (int i = 0; i < baselist.itemsSize(); i++) {
			System.out.println("\t" + baselist.getItem(i));
		}

		System.out.println("Lista Enumerada");
		for (int i = 0; i < enumeratedList.itemsSize(); i++) {
			System.out.println("\t" + enumeratedList.getItem(i));
		}

		System.out.println("Lista Base");
		for (int i = 0; i < vignetteList.itemsSize(); i++) {
			System.out.println("\t" + vignetteList.getItem(i));
		}
	}

	public void metodoDos() {
		IList implementation = new ImplUniqueList();
		BaseList baselist = new BaseList();
		baselist.setImplementation(implementation);
		
		for (int i = 0; i < 10; i++) {
			baselist.addItem("Test "+i);
		}
		
		AlphabeticList alphabeticList = new AlphabeticList(AlphabeticList.UPPER_CASE );
		alphabeticList.setImplementation(implementation);
		
		System.out.println("Lista Alfabetica");
		for (int i = 0; i < alphabeticList.itemsSize(); i++) {
			System.out.println("\t" + alphabeticList.getItem(i));
		}
	}

	public static void main(String... args) {
		Main main = new Main();
//		main.metodoUno();
		main.metodoDos();
	}

}