package friday325sept11;

//An interface only has method signatures.
//What functinallity do all IoTDevices need to provide?
//This is the first of the design process.
//It can be done by creating use cases. 
public interface IoTDevice {
    void turnOn();
    void turnOff();
    boolean isOn();
    String identify();
}
