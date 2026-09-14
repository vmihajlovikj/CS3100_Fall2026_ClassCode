

import java.util.ArrayList;
import java.util.List;

import lecture1.Fan;
import lecture1.IoTDevice;
import lecture1.Light;
import lecture1.Thermostat;
import lecture2.Book;
import lecture2.BookType;

public class Main {
    public static void main(String [] args){
        Light.MIN_POWER = 0;

        Light light1 = new Light("Bedroom", 10);
        Light light2 = new Light("Bedroom", 10);

        System.out.println(light1.MIN_POWER);
        System.out.println(light2.MIN_POWER);

        light2.MIN_POWER = 30;

        System.out.println(light1.MIN_POWER);
        System.out.println(light2.MIN_POWER);
        
    }
}

