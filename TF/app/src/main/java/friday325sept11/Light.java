package friday325sept11;

public class Light extends AbstractIoTDevice {
    private final int power;

    public Light(String name, int power){
        super(name);
            
        if ( power < 0 )
            throw new IllegalArgumentException("Power cannot be negaive");

        this.power = power;
    }

    public String identify(){ //Light is at 50%
        return String.format("Light is at %2d%% power.", this.power);
    }
}
