/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.iteratorpattern.main;

import co.com.iteratorpattern.pattern.EmpleadoConcreto;
import co.com.iteratorpattern.pattern.IIterador;

/**
 *
 * @author JuanC
 */
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            // Crear el objeto agregado que contiene la lista (un vector en este ejemplo)
            EmpleadoConcreto empleado = new EmpleadoConcreto();
            // Crear el objeto iterador para recorrer la lista
            IIterador iterador = empleado.getIterador();
  
            String obj = (String) iterador.primero();
            System.out.println( obj );
     
            iterador.siguiente();
            iterador.siguiente();
        
            System.out.println( (String) iterador.actual() + "\n" );
         
            iterador.primero();
         
            while( iterador.hayMas()) {
                System.out.println( iterador.siguiente() );
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}