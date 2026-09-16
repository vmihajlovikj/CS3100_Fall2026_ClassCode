package lecture1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.nio.charset.IllegalCharsetNameException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FanTest extends AbstractIoTDeviceTest {
    private IoTDevice device;

    @BeforeEach 
    void setup(){
        this.device = new Fan("KitchenFan", 80);
    }
    @Test
    void testNegativeSpeed(){
        try{
            IoTDevice device1 = new Fan("Kitchen", -10);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Speed cannot be negative.", e.getMessage());
        }
    }


    //Make sure to test toString.
    @Test
    void testIdentify() {
        assertEquals("Fan's speed is at 80% speed.", this.device.identify());
    }


    @Override
    protected IoTDevice makeCorrectDevice(String name) {
        return new Fan(name, 10);
    }
}
    // @Test
    // void testEmptyName(){
    //  IllegalArgumentException exception 
    //                     = assertThrows( IllegalArgumentException.class, 
    //                         () -> { new Light("", 80);});

    //     assertEquals("Name cannot be empty.", exception.getMessage());                    
    // }