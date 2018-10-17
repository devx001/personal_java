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
public abstract class Pedido {

    protected double valor;   

    protected Pedido(double valor) {
        this.valor = valor;
    }
    
    protected abstract void alertaPedido();

}
