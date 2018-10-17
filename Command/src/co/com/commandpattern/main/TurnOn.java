package co.com.commandpattern.main;

/**
 * Concrete Command - Command Pattern
 * @author JuanC
 */
public class TurnOn extends Command{
   
    public Receiver _receiver;
    
    public TurnOn(Receiver receiver){
        this._receiver = receiver;
    }
    
    @Override
    public void Execute(){
        this._receiver.TurnOn();
    }
}
