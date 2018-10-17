package co.com.adapterpattern.impl;

import co.com.adapterpattern.def.IMotor;

/**
 *
 * @author JuanC
 */
public class MotorEconomico implements IMotor {

    public MotorEconomico() {
        
        System.out.println("Creando el motor Economico");
    }

    @Override
    public void encender() {
        System.out.println("encendiendo motor Economico");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando el motor Economico");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor Economico");
    }
}
