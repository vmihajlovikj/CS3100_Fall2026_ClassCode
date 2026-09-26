package tf_referencesandmutability;

import java.util.List;

public interface IPath2D {
    List<IPoint> getPath();    
    IPath2D scale(int factor);
    IPath2D removeDuplicates();
}
