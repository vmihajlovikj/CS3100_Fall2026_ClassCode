package IoTDevices;

public class Fan extends AbstractIoTDevice {
    private final int speed;
    
    public Fan(String name, int speed){
        super(name);
        if ( speed < 0 ){
            throw new IllegalArgumentException("Speed cannot be negative.");
        }
        this.speed = speed;
    }

    @Override 
    public String identify(){
        return String.format("Fan's speed is at %d%% speed.", this.speed);
    }  
}
