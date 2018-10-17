package co.com.commandpattern.command;

import java.util.Random;

import co.com.commandpattern.utils.DataServer;


public class TurnOffServer implements Command {

	private IServer server;
	private final DataServer dataServer;
	
	public TurnOffServer(IServer server, final DataServer dataServer) {
		this.server = server;
		this.dataServer = dataServer;
	}

	private void statusInit() {
		System.out.println("STATUS:\t Turnning off server:");
		System.out.println("Host: "+dataServer.getHost());
		System.out.println("User: "+dataServer.getUser());
		System.out.println("Pass: "+dataServer.getPass());
	}
	
	@Override
	public void execute() throws InterruptedException {
		statusInit();
		updateStatus(this.server.testConnection());
		updateStatus(this.server.connect());
		updateStatus(this.server.stopServices());
		updateStatus(this.server.saveLog());
		updateStatus(this.server.turnOff());
		if(dataServer.isOsBase()) {
			updateStatus(this.server.turnOffBaseOS());
		}
		System.out.println("OK");
	}
	
	private void updateStatus(String status) throws InterruptedException {
		dataServer.setStatus(status);
		System.out.println("\t"+status);
		Thread.sleep(new Random().nextInt(3)*1000);
	}


	
}
