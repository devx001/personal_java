package co.com.commandpattern.command;

public class WindowsServer implements IServer {

	@Override
	public String turnOff() {
		return "Turning off... Server Windows";
	}

	@Override
	public String turnOn() {
		return "Turning on... Server Windows";
	}

	@Override
	public String connect() {
		return "Connecting... Server Windows";
	}

	@Override
	public String testConnection() {
		return "Testing connection... Server Windows";
	}

	@Override
	public String saveLog() {
		return "Saving logs... Server Windows";
	}

	@Override
	public String makeBackup() {
		return "Doing backup... Server Windows";
	}

	@Override
	public String closeConnection() {
		return "Closing connection... Server Windows";
	}

	@Override
	public String initServices() {
		return "Starting services... Server Windows";
	}

	@Override
	public String stopServices() {
		return "Stopping services... Server Windows";
	}

	@Override
	public String turnOnBaseOS() {
		return "Turnning on Base OS... Server Windows";
	}

	@Override
	public String turnOffBaseOS() {
		return "Turnning off Base OS... Server Windows";
	}
}
