package co.com.commandpattern.command;

public class LinuxServer implements IServer {

	@Override
	public String turnOff() {
		return "Turning off... Server Linux";
	}

	@Override
	public String turnOn() {
		return "Turning on... Server Linux";
	}

	@Override
	public String connect() {
		return "Connecting... Server Linux";
	}

	@Override
	public String testConnection() {
		return "Testing connection... Server Linux";
	}

	@Override
	public String saveLog() {
		return "Saving logs... Server Linux";
	}

	@Override
	public String makeBackup() {
		return "Doing backup... Server Linux";
	}

	@Override
	public String closeConnection() {
		return "Closing connection... Server Linux";
	}

	@Override
	public String initServices() {
		return "Starting services... Server Linux";
	}

	@Override
	public String stopServices() {
		return "Stopping services... Server Linux";
	}

	@Override
	public String turnOnBaseOS() {
		return "Turnning on Base OS... Server Linux";
	}

	@Override
	public String turnOffBaseOS() {
		return "Turnning off Base OS... Server Linux";
	}
}
