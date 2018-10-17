package co.com.commandpattern.command;

public class MacServer implements IServer {

	@Override
	public String turnOff() {
		return "Turning off... Server Mac";
	}

	@Override
	public String turnOn() {
		return "Turning on... Server Mac";
	}

	@Override
	public String connect() {
		return "Connecting... Server Mac";
	}

	@Override
	public String testConnection() {
		return "Testing connection... Server Mac";
	}

	@Override
	public String saveLog() {
		return "Saving logs... Server Mac";
	}

	@Override
	public String makeBackup() {
		return "Doing backup... Server Mac";
	}

	@Override
	public String closeConnection() {
		return "Closing connection... Server Mac";
	}

	@Override
	public String initServices() {
		return "Starting services... Server Mac";
	}

	@Override
	public String stopServices() {
		return "Stopping services... Server Mac";
	}
	
	@Override
	public String turnOnBaseOS() {
		return "Turnning on Base OS... Server Mac";
	}

	@Override
	public String turnOffBaseOS() {
		return "Turnning off Base OS... Server Mac";
	}
}
