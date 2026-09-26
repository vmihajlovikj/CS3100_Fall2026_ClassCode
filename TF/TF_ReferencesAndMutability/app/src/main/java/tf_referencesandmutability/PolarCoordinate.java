package tf_referencesandmutability;

public class PolarCoordinate implements IPoint {
    private final int distance;
    private final double angle;

    public PolarCoordinate(int distance, double angle){
        this.distance = distance;
        this.angle = angle;
    }
    //soh cah toa
    @Override
    public int getX() {
        return (int)Math.acos( Math.toRadians(angle)) * distance;
    }

    @Override
    public int getY() {
        return (int)Math.asin( Math.toRadians(angle)) * distance;
    }

    @Override 
    public String toString(){
        return "(" + getX() + "," + getY() + ")";
    }
    //TODO: implement toString, hashCode and equals. Note that equals should probably work
    //with IPoint. Meaning, I should be able to compare PolarCoordinates to Point2D ( Cartesian ).
    


}
