/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.patrones.factorymethod;

/**
 *
 * @author Juan 
 */
public class PedidoBitcoin extends Pedido {

    protected PedidoBitcoin(double valor) {
        super(valor);
    }

    protected void alertaPedido(){
        
        System.out.println("El tipo de pago es Bitcoin y tiene un valor de: "+valor);
        
    }

}
