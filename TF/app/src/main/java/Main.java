

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import BookAndAuthor.Book;
import BookAndAuthor.BookType;
import BookAndAuthor.MyBookType;
import Templates.MyList;
import friday325sept11.Fan;
import friday325sept11.IoTDevice;
import friday325sept11.Thermostat;

//SOLID 
//D - dependcy inversion. Depend on the what, not on the how.
public class Main {
    public static void main(String [] args){
        MyList<IoTDevice> list = new MyList<IoTDevice>(10);
        list.add(1);
        list.add(2);
        list.add(3);

       IoTDevice device1 = new Fan("Bathroom", 80); //0x252
       IoTDevice device2 = new Fan("Bathroom", 80); //0x260
       IoTDevice device3 = new Thermostat("Bathroom", 80);

        List<IoTDevice> devices = new ArrayList<>();
        devices.add(device1);
        devices.add(device2);
        devices.add(device3);


        System.out.println( device1.hashCode() + " " + device3.hashCode());
        System.out.println(device1 == device2);
        System.out.println(device1.equals(device2));
    }
}
 // IoTDevice device1 = new Light("Kitchen", 50);
        // IoTDevice device2 = new Fan("Batrhoom", 80);
        // IoTDevice device3 = new Thermostat("Bedroom", 72.5);
        // //What if I want a single list to contain all of my devices.
        // List<IoTDevice> devices = new ArrayList<>();
        // devices.add(device1);
        // devices.add(device2);
        // devices.add(device3);
        
        // for ( IoTDevice device : devices){
        //     System.out.println(device.identify());
        // }