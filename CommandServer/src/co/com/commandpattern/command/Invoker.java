package co.com.commandpattern.command;


public class Invoker {

	public void invoke(Command command) throws InterruptedException {
		command.execute();
	}

}
