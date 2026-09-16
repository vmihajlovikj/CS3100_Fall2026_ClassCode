package lecture1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.nio.charset.IllegalCharsetNameException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightTest extends AbstractIoTDeviceTest {
    private IoTDevice device;
    //So device1 will be used for all
    //non abstract test.

    @BeforeEach 
    protected void setup(){
        this.device = new Light("Kitchen", 80);    
    }


    @Test
    void testNegativePower(){
        try{
            new Light("Kitchen", -10);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Power cannot be negative.", e.getMessage());
        }
    }


    //Make sure to test toString.
    @Test
    void testIdentify() {
        assertEquals("Light is at 80% power.", this.device.identify());
    }


    @Override
    protected IoTDevice makeCorrectDevice(String name) {
        return new Light(name, 10);
    }
}
    // @Test
    // void testEmptyName(){
    //  IllegalArgumentException exception 
    //                     = assertThrows( IllegalArgumentException.class, 
    //                         () -> { new Light("", 80);});

    //     assertEquals("Name cannot be empty.", exception.getMessage());                    
    // }