package co.com.decoratorpattern.decorator.concretewarrior;

import co.com.decoratorpattern.decorator.warrior.base.AbstractWarrior;

public class Cavalier extends AbstractWarrior {
	
	@Override
	public int getDamage() {
		return 7;
	}
	
	@Override
	public String getWeapons() {
		return "Lanza";
	}
	
}
