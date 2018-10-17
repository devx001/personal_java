package co.com.adapterpattern.impl;

import co.com.adapterpattern.def.IMotor;

/**
 *
 * @author JuanC
 */
public class MotorComun implements IMotor {

    public MotorComun() {
        
        System.out.println("Creando el motor comun");
    }

    @Override
    public void encender() {
        System.out.println("encendiendo motor comun");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando el motor comun");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor comun");
    }
}
