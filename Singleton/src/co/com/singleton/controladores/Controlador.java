package co.com.singleton.controladores;

import co.com.singleton.general.MyLogger;

public class Controlador {
	
	private final static MyLogger log = MyLogger.getInstance();
	
	public void info(String msg) {
       log.info(this.getClass().getName(), msg);

    }

    public void error(String msg, Exception ce) {               
    	log.error(this.getClass().getName(), msg, ce);      
    }

    public void warning(String msg) {
    	log.warning(this.getClass().getName(), msg);
    } 
    
    

}
