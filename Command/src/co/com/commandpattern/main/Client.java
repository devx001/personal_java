package co.com.commandpattern.main;

/**
 * Client - Command Pattern
 * @author JuanC
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver radio = new Receiver();
        Command command = new TurnOn(radio);
        invoker.StoreCommand(command);
        for(int i = 0;i<invoker.commands.size();i++){
            invoker.commands.get(i).Execute();
        }
    }
    
}
