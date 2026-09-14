package lecture1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class AbstractIoTDeviceTest {
    protected IoTDevice device;


    protected abstract IoTDevice makeCorrectDevice(String name);
    

    @Test
    void testNullPointerExceptionNullName(){
        try{
            IoTDevice device = makeCorrectDevice(null);
            fail();
        }catch (NullPointerException e){
            assertTrue(true);
        }
    }

    @Test
    void testIllegalArgumentExceptionEmptyName(){
        try{
            IoTDevice device = makeCorrectDevice("");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Name cannot be empty.", e.getMessage());
        }
    }
    @Test
    void testIsOn() {
        IoTDevice device = makeCorrectDevice("Device1");
        assertTrue(device.isOn());
    }

    @Test
    void testTurnOff() {
        IoTDevice device = makeCorrectDevice("Device1");
        assertTrue(device.isOn());
        device.turnOff();
        assertFalse(device.isOn());
    }
}
