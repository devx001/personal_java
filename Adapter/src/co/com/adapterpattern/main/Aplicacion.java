package co.com.adapterpattern.main;

import co.com.adapterpattern.def.IMotor;
import co.com.adapterpattern.impl.MotorCarburadorAdapter;
import co.com.adapterpattern.impl.MotorComun;
import co.com.adapterpattern.impl.MotorEconomico;
import co.com.adapterpattern.impl.MotorElectricoAdapter;
import co.com.adapterpattern.impl.MotorManibelaAdapter;

/**
 * 
 * @author JuanC
 *
 */
public class Aplicacion {

    public void usarMotorComun() {
        IMotor motor = new MotorComun();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

    public void usarMotorElectrico() {
        IMotor motor = new MotorElectricoAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

    public void usarMotorEconomico() {
        IMotor motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
    
    public void usarMotorCarburador() {
        IMotor motor = new MotorCarburadorAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
    
    public void usarMotorManibela() {
        IMotor motor = new MotorManibelaAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}
