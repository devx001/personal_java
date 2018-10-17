package co.com.adapterpattern.impl;

import co.com.adapterpattern.def.IMotor;

/**
 *
 * @author JuanC
 */
public class MotorElectricoAdapter implements IMotor {

    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        this.motorElectrico = new MotorElectrico();
        System.out.println("Creando motor Electrico adapter");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motorElectricoAdapter");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor electrico...");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
