/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bridgepattern.impl;

import java.util.ArrayList;

import co.com.bridgepattern.def.IList;

/**
 *
 * @author JuanC
 */

/*Esta clase solo soporta tareas únicas*/

/*REFINED ABSTRACTION*/
public class ImplUniqueList implements IList {
    
    private ArrayList<String> itemsList = new ArrayList<>();
    
    
    /*No acepta que se añadan items repetidos*/
    @Override
    public void addItem(String item) {
        if (!itemsList.contains(item)) {
            itemsList.add(item);
        }
    }

    /*Elimina el item*/
    @Override
    public void removeItem(String item) {
        
        if (itemsList.contains(item)) {
            itemsList.remove(itemsList.indexOf(item));
        }
    }

    /*Retorna el Tamaño de la lista*/
    @Override
    public Integer getItemsSize() {
        return itemsList.size();
    }

    /*Retorna un item de la lista*/
    @Override
    public String getItem(Integer index) {
        if (index < itemsList.size()) {
            return (String) itemsList.get(index);
        }
        return null;
    }
    
    @Override
    /*Soporta repetidos*/
    public boolean supportRepeat() {
        return false;
    }
}
