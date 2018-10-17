/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bridgepattern.bridge;

/**
 *
 * @author JuanC
 */
public class VignetteList extends BaseList {

    private char vignetteType;

    /*   
        Este método permite la selección de una viñeta con la cual se va a mostrar la lista '*', '-', '+' 
     */
    public void setItemType(char newType) {
        /*Si es mayor a vacío*/
        if (newType > ' ') {
            vignetteType = newType;
        } else {
            vignetteType = '+';
        }
    }

    @Override
    public String getItem(Integer index) {
        return vignetteType + " " + super.getItem(index);

    }
}
