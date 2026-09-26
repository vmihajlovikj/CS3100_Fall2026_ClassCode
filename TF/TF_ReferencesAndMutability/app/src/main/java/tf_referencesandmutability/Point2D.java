package tf_referencesandmutability;

import java.util.Objects;

public class Point2D implements IPoint {
    private final int x;
    private final int y;

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override 
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    @Override 
    public String toString(){
        return "(" + x + "," + y + ")";
    }

    @Override 
    public int hashCode(){
        return Objects.hash(x,y);
    }

    @Override 
    public boolean equals(Object obj){
        if ( this == obj ){
            return true;
        }

        if ( ! ( obj instanceof Point2D ) ){
            return false;
        }

        Point2D otherPoint = (Point2D)obj;
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }


}
