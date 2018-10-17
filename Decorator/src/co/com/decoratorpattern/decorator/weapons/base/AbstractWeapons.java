/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.decoratorpattern.decorator.weapons.base;

import co.com.decoratorpattern.decorator.warrior.base.AbstractWarrior;

/**
 * Clase abstracta base de armas
 * 
 * @author JuanC
 */

public abstract class AbstractWeapons extends AbstractWarrior {
	protected AbstractWarrior warrior;
}
