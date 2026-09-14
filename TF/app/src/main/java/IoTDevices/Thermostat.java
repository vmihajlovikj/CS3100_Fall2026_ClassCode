package IoTDevices;

public class Thermostat extends AbstractIoTDevice {
    private final double temperature;

    public Thermostat(String name, double temperature){
        super(name);

        if ( temperature < 32 ){
            throw new IllegalArgumentException("Cannot be lower than 32F");
        }

        this.temperature = temperature;
    }

    @Override 
    public String identify(){
        return String.format("Temperature is at: %.2f F", temperature);
    }
}
