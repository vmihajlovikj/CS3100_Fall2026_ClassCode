package IoTDevices;

public interface IoTDevice {
    void turnOn();
    void turnOff();
    boolean isOn();
    String identify();
} 