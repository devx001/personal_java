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
public class EnumeratedList extends BaseList {

    
    /*Sobreescribe el método de obtener Item*/
    @Override
    public String getItem(Integer index) {
        return (index + 1) + ". " + super.getItem(index);
    }
}
