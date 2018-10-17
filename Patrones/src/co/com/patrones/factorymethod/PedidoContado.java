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
public class PedidoContado extends Pedido{  
    
    protected PedidoContado(double valor){
        super(valor);
    };
     
    
    protected void alertaPedido(){
        
        System.out.println("El tipo de pago es contado y tiene un valor de: "+valor);
        
    }
    
}
