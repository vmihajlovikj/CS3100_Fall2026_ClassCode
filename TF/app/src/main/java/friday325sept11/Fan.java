package friday325sept11;

public class Fan extends AbstractIoTDevice {
    //a constatnt shared amongst every object of this class
    private final static int MAX_SPEED = 100;
    private final int speed;

    public Fan(String name, int speed){
        super(name);
        if ( speed < 0 || speed > MAX_SPEED){
            throw new IllegalArgumentException("Speed cannot be negative.");
        }
        this.speed = speed;
    }
    
    public String identify(){ //Light is at 50%
        return String.format("Fan is at %2d%% speed.", this.speed);
    }
}
