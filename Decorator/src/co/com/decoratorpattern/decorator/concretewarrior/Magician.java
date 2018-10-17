package co.com.decoratorpattern.decorator.concretewarrior;

import co.com.decoratorpattern.decorator.warrior.base.AbstractWarrior;

public class Magician extends AbstractWarrior {
	
	@Override
	public int getDamage() {
		return 12;
	}
	
	@Override
	public String getWeapons() {
		return "Hechizo";
	}
	
}
