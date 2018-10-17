/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.decoratorpattern.decorator.concretewarrior;

import co.com.decoratorpattern.decorator.warrior.base.AbstractWarrior;

/**
 * Guerrero de infanteria con los metodos ya implementados
 * 
 * @author JuanC
 */
public class Infantry extends AbstractWarrior {
	
	@Override
	public int getDamage() {
		return 10;
	}
	
	@Override
	public String getWeapons() {
		return "Espada";
	}
}
