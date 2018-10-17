package co.com.commandpattern.main;

import java.util.ArrayList;
import java.util.List;

import co.com.commandpattern.command.BackupServer;
import co.com.commandpattern.command.Command;
import co.com.commandpattern.command.IServer;
import co.com.commandpattern.command.Invoker;
import co.com.commandpattern.command.MacServer;
import co.com.commandpattern.command.ResetServer;
import co.com.commandpattern.command.TurnOffServer;
import co.com.commandpattern.command.TurnOnServer;
import co.com.commandpattern.utils.DataServer;

public class Main {

	private Invoker invoker;
	private DataServer dataServer;
	private IServer server;

	private List<DataServer> getServers() {
		DataServer server1 = new DataServer();
		server1.setHost("192.168.6.2");
		server1.setUser("apolo");
		server1.setPass("*********");
		server1.setBaseOs(true);

		DataServer server2 = new DataServer();
		server2.setHost("192.168.24.1");
		server2.setUser("artemisa");
		server2.setPass("*********");

		DataServer server3 = new DataServer();
		server3.setHost("172.20.50.1");
		server3.setUser("ares");
		server3.setPass("*********");
		server1.setBaseOs(true);

		DataServer server4 = new DataServer();
		server4.setHost("10.170.6.11");
		server4.setUser("athena");
		server4.setPass("*********");

		List<DataServer> servers = new ArrayList<DataServer>();
		servers.add(server1);
		servers.add(server2);
		servers.add(server3);
		servers.add(server4);
		
		return servers;

	}

	private void init() throws InterruptedException {
		dataServer = new DataServer();
		dataServer.setStatus("Starting....");
		invoker = new Invoker();
		server = new MacServer();

	}

	private void backupServer() throws InterruptedException {
		Command command;
		for (DataServer dataServer : getServers()) {
			command = new BackupServer(server, dataServer);
			invoker.invoke(command);
			System.out.println("**********************************************************************\n\r");
		}
	}

	private void restartServer() throws InterruptedException {
		Command command;
		for (DataServer dataServer : getServers()) {
			command = new ResetServer(server, dataServer);
			invoker.invoke(command);
			System.out.println("**********************************************************************\n\r");
		}
	}

	private void turnOffServer() throws InterruptedException {
		Command command;
		for (DataServer dataServer : getServers()) {
			command = new TurnOffServer(server, dataServer);
			invoker.invoke(command);
			System.out.println("**********************************************************************\n\r");
		}
	}

	private void turnOnServer() throws InterruptedException {
		Command command;
		for (DataServer dataServer : getServers()) {
			command = new TurnOnServer(server, dataServer);
			invoker.invoke(command);
			System.out.println("**********************************************************************\n\r");
		}
	}

	public static void main(String[] args) {
		try {
			Main main = new Main();
			main.init();
			System.out.println("**********************************Turn Off************************************\\n\\r");
			main.turnOffServer();
			System.out.println("**********************************Turn On************************************\\n\\r");
			main.turnOnServer();
			System.out.println("**********************************Backup************************************\\n\\r");
			main.backupServer();
			System.out.println("**********************************Restart************************************\\n\\r");
			main.restartServer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
