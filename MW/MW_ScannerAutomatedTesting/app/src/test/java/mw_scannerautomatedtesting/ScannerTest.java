package mw_scannerautomatedtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import org.junit.jupiter.api.Test;

public class ScannerTest {
    
    @Test
    public void testOnlyQ(){
        testScannerHelper("q", "Enter a number: Exiting.");
    }

    @Test 
    public void testQWith1Input(){
        testScannerHelper("1 q", 
        "Enter a number: You entered: 1Enter another number: Exiting.");
        
    }

    public void testScannerHelper(String input, String expected){
      OutputStream actualAoutput = new ByteArrayOutputStream();  
      ITestableMain controller = new TestableMain( 
                                new ByteArrayInputStream(input.getBytes()),
                                actualAoutput);
      controller.run();

      assertEquals( expected, actualAoutput.toString() );
    }
}
