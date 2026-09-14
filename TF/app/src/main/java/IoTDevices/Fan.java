package IoTDevices;

public class Fan extends AbstractIoTDevice {
    private final int speed;

    public Fan(String name, int speed){
        super(name);
        if ( speed < 0 ){
            throw new IllegalArgumentException("Speed cannot be negavie.");
        }
        this.speed = speed;
    }
    
    public String identify(){ //Light is at 50%
        return String.format("Fan is at %2d%% speed.", this.speed);
    }
}
