/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.patrones.factorymethod;



/**
 *
 * @author Diego
 */
public abstract class Cliente {
    
    protected abstract Pedido creaPedido(double valor);    
    
    
    public void nuevoPedido(double valor){
        Pedido pedido = this.creaPedido(valor);
        pedido.alertaPedido();
    }
    
}
