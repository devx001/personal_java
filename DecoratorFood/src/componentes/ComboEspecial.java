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
public class ComboEspecial extends Combo{

	public ComboEspecial()
	{
		descripcion="Doble Porción de Papas Fritas,3 tipos de salsas, " +
				"doble queso, Hamburguesa Especial, " +
				"Doble Carne, Doble tomate,2 Gaseosas";
	}
	
	@Override
	public int valor() {
		return 10400;
	}
	
	
}
