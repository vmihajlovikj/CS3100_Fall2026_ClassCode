package BookAndAuthor;

import java.util.Objects;

public class MyBookType {
    private final String value;

    public static MyBookType EBOOK = new MyBookType("EBOOK");//0x100
    public static MyBookType AUDIO = new MyBookType("AUDIO");//0x200
    public static MyBookType HARDCOVER = new MyBookType("HARDCOVER");//0x300
    public static MyBookType SOFTCOVER = new MyBookType("SOFTCOVER");//0x400
    public static MyBookType KINDLE = new MyBookType("KINDLE");//0x500

    private MyBookType(String value){
        this.value = Objects.requireNonNull(value);
    }

    @Override 
    public String toString(){
        return value;
    }
}
