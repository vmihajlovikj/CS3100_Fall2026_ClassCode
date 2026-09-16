package friday325sept11;

public abstract class AbstractIoTDevice implements IoTDevice{
    protected final String name;
    protected boolean isOn;

    protected AbstractIoTDevice(String name){
        if ( name == null )
            throw new NullPointerException("Name cannot be null.");
        if ( name.isEmpty() )
            throw new IllegalArgumentException("Name cannot be empty.");
    
        this.name = name;
        this.isOn = false;
    }

    @Override
    public void turnOn(){
        this.isOn = true;
    }
    @Override 
    public void turnOff(){
        this.isOn = false;
    }

    @Override 
    public boolean isOn(){
        return this.isOn;
    }

}