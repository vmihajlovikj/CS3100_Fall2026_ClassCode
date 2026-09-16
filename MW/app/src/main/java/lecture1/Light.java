package lecture1;

import java.util.Objects;

public class Light extends AbstractIoTDevice {
    private final int power;
    public static int MIN_POWER = 20;
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

    @Override 
    public int hashCode(){
        return Objects.hash(this.name, this.power);
    }

    @Override 
    public boolean equals(Object other){
        if ( this == other ){
            return true;
        }

        if ( !(other instanceof Light) ){
            return false;
        }

        Light otherLight = (Light)other;
        return this.name.equals(otherLight.name) && this.power == otherLight.power;
    }
    
}
