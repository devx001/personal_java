package co.com.commandpattern.command;


public interface IServer {

	String turnOff();

	String turnOn();

	String connect();

	String testConnection();

	String saveLog();
	
	String makeBackup();

	String closeConnection();
	
	String initServices();
	
	String stopServices();
	
	String turnOnBaseOS();
	
	String turnOffBaseOS();

}
