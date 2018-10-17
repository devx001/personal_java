/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bridgepattern.bridge;

import co.com.bridgepattern.def.IList;

/**
 *
 * @author JuanC
 */



/*Esta clase solo muestra la lista de forma plana*/

/*IMPLEMENTOR*/
public class BaseList {

    protected IList implementation;

    /*Asigna una implementacion al objeto implementation, dependiendo de el 
    tipo de lista que desee, es decir si desea que soporte  items repetidos o no*/
    public void setImplementation(IList impl) {
        this.implementation = impl;
    }

    /*Agrega un item a la lista*/
    public void addItem(String item) {
        implementation.addItem(item);
    }

    /*Remueve un item*/
    public void removeItem(String item) {
        implementation.removeItem(item);
    }

    /*Retorna el tamaño de la lista*/
    public Integer itemsSize() {
        return implementation.getItemsSize();
    }

    /*Retorna un item por el índice*/
    public String getItem(Integer index) {
        return implementation.getItem(index);
    }
}
