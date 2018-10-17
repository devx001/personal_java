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
public class EjemploFactory {

    
    public static void main(String[] args) {
        Cliente cliente;
        cliente = new ClienteContado();
        cliente.nuevoPedido(2050);
        
        cliente = new ClienteCredito();
        cliente.nuevoPedido(25000);
        
        cliente = new ClienteCheque();
        cliente.nuevoPedido(15000);
        
        cliente = new ClienteBono();
        cliente.nuevoPedido(5100);
        
        cliente = new ClienteBitcoin();
        cliente.nuevoPedido(45000);
        
    }
    
}
