package co.com.decoratorpattern.decorator.concreteweapons;

import co.com.decoratorpattern.decorator.warrior.base.AbstractWarrior;
import co.com.decoratorpattern.decorator.weapons.base.AbstractWeapons;

public class Mineral extends AbstractWeapons {
	
	public Mineral(AbstractWarrior guerrero) {
		this.warrior = guerrero;
	}
	
	@Override
	public int getDamage() {
		return this.warrior.getDamage() + 5;
	}
	
	@Override
	public String getWeapons() {
		return this.warrior.getWeapons() +" de cobre";
	}
	
}
