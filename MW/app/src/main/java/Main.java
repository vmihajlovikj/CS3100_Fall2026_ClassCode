

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lecture1.Fan;
import lecture1.IoTDevice;
import lecture1.Light;
import lecture1.Thermostat;
import lecture2.Book;
import lecture2.BookType;
import lecture2.MyBookType;

public class Main {
    public static void main(String [] args){

      IoTDevice light1 = new Light("Kitchen", 30);
      IoTDevice light2 = new Light("Kitchen", 30);

      Map<IoTDevice, String> lightToStrings = new HashMap<>();
      lightToStrings.put(light1, "Ligh1");
      lightToStrings.put(light2, "Light2");

      Set<IoTDevice> lights = new HashSet();
      lights.add(light1);
      lights.add(light2);

      System.out.println( lights.size() );
      System.out.print(lightToStrings.size());
       
        
    }
}

