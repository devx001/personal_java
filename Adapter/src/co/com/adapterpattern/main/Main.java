
package co.com.adapterpattern.main;

/**
 *
 * @author JuanC
 */
public class Main {

   
    public static void main(String[] args) {
        
        Aplicacion aplicacion = new Aplicacion();
        
        System.out.println("******************************************************** Motor Comun ********************************************************");
        aplicacion.usarMotorComun();
        
        System.out.println("****************************************************** Motor Economico ******************************************************");
        aplicacion.usarMotorEconomico();
        
        System.out.println("****************************************************** Motor Electrico *******************************************************");
        aplicacion.usarMotorElectrico();
       
        System.out.println("***************************************************** Motor Carburador ******************************************************");
        aplicacion.usarMotorCarburador();
        
        System.out.println("****************************************************** Motor Manibela *******************************************************");
        aplicacion.usarMotorManibela();
        
    }
    
}
