package co.com.decoratorpattern.decorator.concreteweapons;

import co.com.decoratorpattern.decorator.warrior.base.AbstractWarrior;
import co.com.decoratorpattern.decorator.weapons.base.AbstractWeapons;

public class Air extends AbstractWeapons {
	
	public Air(AbstractWarrior guerrero) {
		this.warrior = guerrero;
	}
	
	@Override
	public int getDamage() {
		return this.warrior.getDamage() + 15;
	}
	
	@Override
	public String getWeapons() {
		return this.warrior.getWeapons() + " de aire";
	}
	
}
