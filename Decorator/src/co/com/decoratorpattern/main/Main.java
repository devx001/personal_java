package co.com.decoratorpattern.main;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import co.com.decoratorpattern.decorator.concretewarrior.Archer;
import co.com.decoratorpattern.decorator.concretewarrior.Cavalier;
import co.com.decoratorpattern.decorator.concretewarrior.Infantry;
import co.com.decoratorpattern.decorator.concretewarrior.Magician;
import co.com.decoratorpattern.decorator.concretewarrior.Trojan;
import co.com.decoratorpattern.decorator.concreteweapons.Air;
import co.com.decoratorpattern.decorator.concreteweapons.Fire;
import co.com.decoratorpattern.decorator.concreteweapons.Iron;
import co.com.decoratorpattern.decorator.concreteweapons.Mineral;
import co.com.decoratorpattern.decorator.concreteweapons.Wood;
import co.com.decoratorpattern.decorator.warrior.base.AbstractWarrior;

public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// ******************** Infantry ********************
		AbstractWarrior infanteria = new Infantry();
		infanteria = new Wood(infanteria);
		infanteria = new Fire(infanteria);
		
		System.out.println("******************** Infantry ********************");
		System.out.println("Armas: " + infanteria.getWeapons());
		System.out.println("Daño: " + infanteria.getDamage());
		
		// ******************** Infantry Plus ********************
		AbstractWarrior infanteriaPlus = new Infantry();
		infanteriaPlus = new Iron(infanteriaPlus);
		infanteriaPlus = new Fire(infanteriaPlus);
		
		System.out.println("******************** Infantry Plus ********************");
		System.out.println(infanteriaPlus.getWeapons());
		System.out.println("Daño: " + infanteriaPlus.getDamage());
		
		// ******************** Archer ********************
		AbstractWarrior arquero = new Archer();
		arquero = new Wood(arquero);
		System.out.println("******************** Archer ********************");
		System.out.println("Armas: " + arquero.getWeapons());
		System.out.println("Daño: " + arquero.getDamage());
		
		// ******************** Infantry Plus ********************
		AbstractWarrior trojan = new Trojan();
		trojan = new Mineral(trojan);
		trojan = new Wood(trojan);
		System.out.println("******************** Trojan ********************");
		System.out.println("Armas: " + trojan.getWeapons());
		System.out.println("Daño: " + trojan.getDamage());
		
		// ******************** Magician ********************
		AbstractWarrior magician = new Magician();
		magician = new Air(magician);
		magician = new Fire(magician);
		System.out.println("******************** Magician ********************");
		System.out.println("Armas: " + magician.getWeapons());
		System.out.println("Daño: " + magician.getDamage());
		
		// ******************** Cavalier ********************
		AbstractWarrior cavalier = new Cavalier();
		cavalier = new Iron(cavalier);
		cavalier = new Fire(cavalier);
		System.out.println("******************** Cavalier ********************");
		System.out.println("Armas: " + cavalier.getWeapons());
		System.out.println("Daño: " + cavalier.getDamage());
		
	}
	
}
