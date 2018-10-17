package co.com.singleton.general;

public class MyLogger {
	
	private static MyLogger instance = null;
	
	private MyLogger() {
		// TODO Auto-generated constructor stub
	}
	
	public static MyLogger getInstance(){
        if(instance  == null){
        	synchronized(MyLogger.class) {
        		instance  = new MyLogger();
        	}
        }
        return instance;
    }
	
	public void info(String myclass, String msg) {
        System.out.println("[INFO]: " + " [" + myclass + "] " + msg);

    }

    public void error(String myclass, String msg, Exception ce) {               
        System.err.println("[ERROR]: " + " [" + myclass + "] " + msg + "\t" + ce.getMessage());      
    }

    public void warning(String myclass, String msg) {
    	System.out.println("[WARNING]: " + " [" + myclass + "] " + msg);
    }   
}
