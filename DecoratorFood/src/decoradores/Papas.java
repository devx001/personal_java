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
public class Papas extends AdicionalesDecorator{

	Combo combo;
	
	public Papas(Combo combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Porcion de Papas";
	}

	@Override
	public int valor() {
		return 1500+combo.valor();
	}

}
