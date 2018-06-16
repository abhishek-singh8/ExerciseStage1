import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseStringWithoutBufferTest {
	ReverseStringWithoutBuffer tc;
	   @Before
	    public void setup(){
	        System.out.println("JUnit Call: @Before setUp");
	        tc=new ReverseStringWithoutBuffer();
	    }
	   @Test
	   public void reverseStringTest() {
		   String actualRevString=tc.reverseString("abhishek");
		   String expectedRevString="kehsihba";
		   assertEquals(expectedRevString,actualRevString);
	   }
}
