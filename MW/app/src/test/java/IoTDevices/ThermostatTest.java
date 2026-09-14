package IoTDevices;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class ThermostatTest extends AbstractIoTDeviceTest {

    @Override
    protected IoTDevice makeCorrectDevice(String name) {
        return new Thermostat(name, 10);
    }

    @Test 
    void negativeTemperature(){
        try{
            IoTDevice device = new Thermostat("Bedroom", -11);
            fail();
        }catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }
    
}
