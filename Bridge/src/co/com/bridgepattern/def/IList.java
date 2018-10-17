/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bridgepattern.def;

/**
 *
 * @author JuanC
 */

/*ABSTRACTION*/
public interface IList {
    
    public void addItem(String item);
    public void removeItem(String item);
    public Integer getItemsSize();
    public String getItem(Integer index);
    public boolean supportRepeat();
    
}
