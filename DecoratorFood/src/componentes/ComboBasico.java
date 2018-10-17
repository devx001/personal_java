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
public class ComboBasico extends Combo{

	public ComboBasico() {
		descripcion="Porción de Papas Fritas, " +
			"salsas, Queso, Hamburguesa sencilla, Gaseosa";
	}
	
	@Override
	public int valor() {
		return 6200;
	}
}
