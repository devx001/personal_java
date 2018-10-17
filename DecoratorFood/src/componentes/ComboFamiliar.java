/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

/**
 *
 * @author Alejo
 */
public class ComboFamiliar extends Combo
{
	
	public ComboFamiliar(){
		descripcion="Doble Porción de Papas Fritas, " +
				"Salsas, Doble Queso, Hamburguesa " +
				"Familiar, Doble Tomate, Gaseosa";
	}

	@Override
	public int valor() {
		return 7500;
	}

}
