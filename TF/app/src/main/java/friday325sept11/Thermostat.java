package friday325sept11;

import java.util.Objects;

public class Thermostat extends AbstractIoTDevice {
    private final int temperature;

    public Thermostat(String name, int temperature){
        super(name);

        if ( temperature < 32 ){
            throw new IllegalArgumentException("Cannot be lower than 32F");
        }

        this.temperature = temperature;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(this.name, this.temperature);
    }

     @Override 
    public boolean equals(Object other){
        //is it me?
        if ( this == other ){
            return true;
        }
        //Only use instanceof here, unless told otherwise by us.
        if ( !(other instanceof Thermostat) ){
            return false;
        }
        //Only use if followed by instanceof
        Thermostat otherFan = (Thermostat)other;
        return this.name.equals(otherFan.name) && 
                    this.temperature == otherFan.temperature;
    }

    @Override 
    public String identify(){
        return String.format("Temperature is at: %.2f F", temperature);
    }
}
