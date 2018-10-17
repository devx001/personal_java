package co.com.decoratorpattern.decorator.concretewarrior;

import co.com.decoratorpattern.decorator.warrior.base.AbstractWarrior;

public class Trojan extends AbstractWarrior {
	
	@Override
	public int getDamage() {
		return 9;
	}
	
	@Override
	public String getWeapons() {
		return "Escudo";
	}
	
}
