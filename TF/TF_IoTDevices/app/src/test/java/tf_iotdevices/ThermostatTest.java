package tf_iotdevices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ThermostatTest extends AbstractIoDeviceTest {
    private IoTDevice device;
   
    @BeforeEach 
    void init(){
        this.device = new Thermostat("Kitchen", 50);
    }

    @Test 
    public void testIdentify(){
        assertEquals("Temperature is at: 50 F", this.device.identify());
    }

    @Override
    IoTDevice makeADevice(String name) {
        return new Thermostat(name, 50);
    }
}
