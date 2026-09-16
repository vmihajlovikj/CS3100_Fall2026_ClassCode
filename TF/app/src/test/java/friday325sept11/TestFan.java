package friday325sept11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFan extends AbstractIoDeviceTest {
    private IoTDevice device;
    @BeforeEach 
    void init(){
        this.device = new Fan("Bathroom", 80);
    }


    @Test 
    public void testNegativeSpeed(){
        try{
            this.device = new Fan("Kitchen", -20);
            fail("Did not fail on negative speed.");
        }
        catch(IllegalArgumentException e){
            assertEquals("Speed cannot be negative.", e.getMessage());
        }
    }

    @Test 
    public void testIdentify(){
        assertEquals("Fan is at 80% speed.", device.identify());
    }

    @Override
    IoTDevice makeADevice(String name) {
        return new Fan(name, 20);
    }
}
