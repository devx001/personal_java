/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradores;

import componentes.Combo;

/**
 *
 * @author Alejo
 */
public class Carne extends AdicionalesDecorator{

	Combo combo;
	
	public Carne(Combo combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Porcion de Carne";
	}

	@Override
	public int valor() {
		return 2500+combo.valor();
	}
}
