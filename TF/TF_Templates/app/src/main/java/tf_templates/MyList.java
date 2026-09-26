package tf_templates;
import com.google.common.base.Function;

public class MyList<T> implements IMyList<T>{
    private T[]data;
    private int currentCapacity;
    private int currentSize;
    private final Function<Integer, Integer> resizingFunction;

    public MyList(Function<Integer, Integer> resizingFunction){
        this.currentCapacity = 1;
        this.data = (T[])new Object[this.currentCapacity];
        this.resizingFunction = (Integer c) -> c*2;
        this.currentSize = 0;
    }

    public MyList(){
        this( (Integer c)->c*2);
    }

    //The alternative approach without using function objects.
    // protected int newCapacity(int currentCapacity){
    //     return currentCapacity * 2;
    // }

    @SuppressWarnings("unchecked")
    public void add( T value){
        if ( currentSize == currentCapacity ){
            int newCapacity = this.resizingFunction.apply(this.currentCapacity);
            T[] tempData = (T[])new Object[ newCapacity ];
            for ( int i = 0; i < this.currentSize; i++){
                tempData[i] = this.data[i];
            }

            this.data = tempData;
            this.currentCapacity = newCapacity;
        }
        this.data[currentSize] = value;
        this.currentSize++;
    }

    public T get(int index){
        return this.data[index];
    }

    public int size(){
        return currentSize;
    }
}
