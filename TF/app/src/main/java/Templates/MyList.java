package Templates;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> implements List<T> {
    private final ArrayList<T> data;
    private int currentSize;
    private int capacity;
    public MyList(int size){
        this.data = new ArrayList<T>(size);
        this.capacity = size;
        this.currentSize = 0;
    }
    public void add(T value){
        if ( this.currentSize == this.capacity ){
            throw new IllegalStateException("No more room to add " + value);
        }

        this.data[currentSize] = value;
        this.currentSize++;
    }
    public T get(int index){
        if ( index < 0 || index >= this.capacity ){
            throw new IndexOutOfBoundsException();
        }

        return this.data[index];
    }
}
