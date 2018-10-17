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
public class ClienteCheque extends Cliente{
    
    @Override
    protected Pedido creaPedido(double valor){
        return new PedidoCheque(valor);
    }
    
}
