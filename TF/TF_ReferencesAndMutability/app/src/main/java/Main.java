import java.util.ArrayList;
import java.util.List;


import tf_referencesandmutability.IPoint;
import tf_referencesandmutability.Path2D;
import tf_referencesandmutability.PolarCoordinate;
import tf_referencesandmutability.IPath2D;

public class Main {
    public static void main(String [] args){
        
        List<IPoint> points = new ArrayList<>();
        points.add( new PolarCoordinate(5, 45));
        points.add( new PolarCoordinate(10, 30));
        
        
        IPath2D path = new Path2D(points);
        points.clear();
        
        System.out.println( path );
    }
}
 