package friday325sept11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class AbstractIoDeviceTest {
    
    abstract IoTDevice makeADevice(String name);

    @Test 
    public void testNullName(){
        try{
            IoTDevice device = makeADevice(null);
            fail("No excpetion thrown");
        }catch(NullPointerException e){
            assertTrue(true);
        }
    }

    @Test 
    public void testEmptyName(){
        try{
            IoTDevice device = makeADevice("");
            fail("No excpetion thrown");
        }catch(IllegalArgumentException e){
            assertEquals("Name cannot be empty.", e.getMessage());
        }
    }


    @Test 
    public void testTurnOn(){
        IoTDevice device = makeADevice("Kitchen");
        device.turnOff();
        assertFalse(device.isOn());
        device.turnOn();
        assertTrue(device.isOn());
    }

    @Test 
    public void testIsOff(){
        assertFalse(makeADevice("Kitchen").isOn());
    }
}
