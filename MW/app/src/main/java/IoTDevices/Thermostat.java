package IoTDevices;

public class Thermostat extends AbstractIoTDevice {
    private double temperature;

    public Thermostat(String name, double temperature){
        super(name);
        if ( temperature < 0 ){
            throw new IllegalArgumentException("Temperature cannot be negative.");
        }
        this.temperature = temperature;
    }

    @Override
    public String identify() {
        return String.format("Thermostat temperature is %.2f F", this.temperature);
    }

     @Override 
    public String toString(){
        return this.identify();
    }
    
}
