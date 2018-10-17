package co.com.commandpattern.command;

import java.util.Random;

import co.com.commandpattern.utils.DataServer;

public class TurnOnServer implements Command {

	private IServer server;
	private final DataServer dataServer;

	public TurnOnServer(IServer server, final DataServer dataServer) {
		this.server = server;
		this.dataServer = dataServer;
	}

	private void statusInit() {
		System.out.println("STATUS:\t Turnnig on server:");
		System.out.println("Host: "+dataServer.getHost());
		System.out.println("User: "+dataServer.getUser());
		System.out.println("Pass: "+dataServer.getPass());
	}
	
	@Override
	public void execute() throws InterruptedException {
		statusInit();
		if(dataServer.isOsBase()) {
			updateStatus(this.server.turnOffBaseOS());
		}
		updateStatus(this.server.turnOn());
		updateStatus(this.server.testConnection());
		updateStatus(this.server.connect());
		updateStatus(this.server.initServices());
		updateStatus(this.server.closeConnection());
		System.out.println("OK");
	}

	private void updateStatus(String status) throws InterruptedException {
		dataServer.setStatus(status);
		System.out.println("\t"+status);
		Thread.sleep(new Random().nextInt(3)*1000);
	}


}
