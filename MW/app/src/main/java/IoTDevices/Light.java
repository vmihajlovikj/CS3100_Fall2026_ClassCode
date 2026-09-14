package IoTDevices;

public class Light extends AbstractIoTDevice {
    private final int power;
    public static int MIN_POWER = 0;
    public Light(String name, int power){
        super(name);
        if ( power < MIN_POWER ){
            throw new IllegalArgumentException("Power cannot be under " + MIN_POWER);
        }
        this.power = power;
       
    }

    @Override 
    public String identify(){
        return String.format("Light is at %d%% power.", this.power);
    }
    
}
