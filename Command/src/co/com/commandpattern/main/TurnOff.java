package co.com.commandpattern.main;

/**
 * ConcreteCommand - Command Pattern
 * @author JuanC
 */
public class TurnOff extends Command{

    public Receiver _receiver;
    
    public TurnOff(Receiver receiver){
        this._receiver = receiver;
    }
    
    @Override
    public void Execute(){
        this._receiver.TurnOff();
    }
}
