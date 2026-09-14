package IoTDevices;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//SOLID 
//D - dependcy inversion. Depend on the what, not on the how.
public class Main {
    public static void main(String [] args){
        IoTDevice device1 = new Light("Kitchen", 50);
        IoTDevice device2 = new Fan("Batrhoom", 80);
        IoTDevice device3 = new Thermostat("Bedroom", 72.5);
        //What if I want a single list to contain all of my devices.
        List<IoTDevice> devices = new ArrayList<>();
        devices.add(device1);
        devices.add(device2);
        devices.add(device3);
        
        for ( IoTDevice device : devices){
            System.out.println(device.identify());
        }
        
    }
}
