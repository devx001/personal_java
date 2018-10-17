package co.com.adapterpattern.impl;

import co.com.adapterpattern.def.IMotor;

public class MotorCarburadorAdapter implements IMotor {
	
	private MotorCarburador motorCarburador; 
	
	public MotorCarburadorAdapter() {
		this.motorCarburador = new MotorCarburador();
		System.out.println("Iniciando adaptador para motor carburador ");
	}
	
	@Override
	public void encender() {
		motorCarburador.cargarGasolinaCarburador();
		motorCarburador.prender();

	}

	@Override
	public void acelerar() {
		System.out.println("Acelerar motor carburador");

	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor carburador");
	}

}
