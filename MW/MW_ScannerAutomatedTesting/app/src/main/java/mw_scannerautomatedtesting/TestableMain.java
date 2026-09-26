package mw_scannerautomatedtesting;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TestableMain implements ITestableMain{
    private final InputStream input;
    private final OutputStream output;

    public TestableMain(InputStream inputStream, OutputStream outputStream){
        this.input = Objects.requireNonNull(inputStream);
        this.output = Objects.requireNonNull(outputStream);
    }

    private void write(String masssage){
        try{
            this.output.write(masssage.getBytes());
        }catch(IOException e){
            throw new IllegalStateException("Writing failed.");
        }
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(this.input);
        List<Integer> database = new ArrayList<>();

        write("Enter a number: ");
        while ( scanner.hasNext() ){
            String value = scanner.next();

            if (value.equalsIgnoreCase("q")){
                write("Exiting.");
                return;
            }

            try{
                int intValue = Integer.parseInt(value);
                database.add(intValue);    
            }catch(NumberFormatException e){
                write("String entered, enter a number: ");
                continue;
            }

            write("You entered: " + value);
            write("Enter another number: ");
        }
        
    }
    
}
