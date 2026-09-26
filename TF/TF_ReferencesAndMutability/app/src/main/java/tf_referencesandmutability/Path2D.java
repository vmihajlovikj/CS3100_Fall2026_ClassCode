package tf_referencesandmutability;

import java.util.ArrayList;
import java.util.List;

public class Path2D implements IPath2D {
    private final List<IPoint> points; // points => 0x100 ( 0x300 0x400 )

    public Path2D(List<IPoint> points){
        this.points = new ArrayList<>(points); 
    }

    
    @Override
    public List<IPoint> getPath() {
        //You can also use as in line 10.
        List<IPoint> copy = new ArrayList<>(); //0x200 ([0x300 0x400)
        for ( IPoint point : points ){
            copy.add(point);
        }
        return copy; //0x200
    }



    @Override
    public IPath2D scale(int factor) {
        List<IPoint> result = this.points;
        for ( IPoint point2d : result ){
            IPoint doubledPoint = new Point2D( point2d.getX() * factor, point2d.getY() * factor);
            result.add(doubledPoint);
        }

        return new Path2D(result);
    }



    @Override
    public IPath2D removeDuplicates() {
        throw new UnsupportedOperationException("Unimplemented method 'removeDuplicates'");
    }

    @Override 
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for ( IPoint point : points ){
            builder.append(point.toString());
            builder.append(" ");
        }
        return builder.toString();
    }
}
