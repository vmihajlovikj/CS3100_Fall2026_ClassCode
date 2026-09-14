

import java.util.ArrayList;
import java.util.List;

import IoTDevices.Light;

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

