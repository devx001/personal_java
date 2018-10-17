package co.com.commandpattern.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker - Command Pattern
 * @author JuanC
 */
public class Invoker {
    List<Command> commands = new ArrayList<Command>();
    
    public void StoreCommand(Command command){
        this.commands.add(command);
    }
}
