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
public class Tomate extends AdicionalesDecorator{

	Combo combo;
	
	public Tomate(Combo combo)
	{
		this.combo=combo;
	}

	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Porcion de Tomate";
	}

	@Override
	public int valor() {
		return 100+combo.valor();
	}

}
