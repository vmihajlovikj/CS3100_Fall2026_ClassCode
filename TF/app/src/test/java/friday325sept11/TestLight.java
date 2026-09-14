package friday325sept11;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLight {
    private IoTDevice device;

    @BeforeEach 
    void init(){
        this.device = new Light("Kitchen", 50);
    }

    @Test 
    public void testTurnOn(){
        device.turnOff();
        assertFalse(device.isOn());
        device.turnOn();
        assertTrue(device.isOn());
    }

    @Test 
    public void testIsOff(){
        assertFalse(device.isOn());
    }
}
