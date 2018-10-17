package co.com.adapterpattern.impl;

import co.com.adapterpattern.def.IMotor;

public class MotorManibelaAdapter implements IMotor {
	
	private MotorManibela motorManibela; 
	
	public MotorManibelaAdapter() {
		this.motorManibela = new MotorManibela();
		System.out.println("Iniciando adaptador para motor manibela ");
	}

	@Override
	public void encender() {
		this.motorManibela.darManibela();
		this.motorManibela.prender();
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando motor a manibela");

	}

	@Override
	public void apagar() {
		System.out.println("Se acabo el impluso manibela");
	}

}
