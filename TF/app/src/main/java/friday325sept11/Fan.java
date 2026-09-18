package friday325sept11;

import java.util.Objects;

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

    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.speed);
    }

    @Override 
    public boolean equals(Object other){
        //is it me?
        if ( this == other ){
            return true;
        }
        //Only use instanceof here, unless told otherwise by us.
        if ( !(other instanceof Fan) ){
            return false;
        }
        //Only use if followed by instanceof
        Fan otherFan = (Fan)other;
        return this.name.equals(otherFan.name) && 
                    this.speed == otherFan.speed;
    }
}
