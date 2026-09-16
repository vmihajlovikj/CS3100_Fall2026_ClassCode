package lecture2;

import java.util.Objects;

public class MyBookType{
    private final String value;


    public final static MyBookType EBOOK = new MyBookType("eBook");
    public final static MyBookType AUDIO = new MyBookType("audio");
    public final static MyBookType PAPER = new MyBookType("paper");

    private MyBookType(String value){
        this.value = Objects.requireNonNull(value);
    }

    @Override 
    public String toString(){
        return this.value;
    }
}