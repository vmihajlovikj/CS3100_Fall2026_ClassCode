package friday325sept11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLight extends AbstractIoDeviceTest {
    private IoTDevice device;
    @BeforeEach 
    void init(){
        this.device = new Light("Kitchen", 50);
    }

    @Test 
    public void testIdentify(){
        assertEquals("Light is at 50% power.", this.device.identify());
    }

    @Override
    IoTDevice makeADevice(String name) {
        return new Light(name, 20);
    }
}
