import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NthIterationTest {
	NthIteration ni;
	  @Before
	    public void setup(){
	       // System.out.println("JUnit Call: @Before setUp");
	        ni=new NthIteration();
	    }
	  @Test
      public void notANumber() {
    	  String actualValue=ni.printNthIteration("45a");
    	  String expectedValue="Not a number";
    	  assertEquals(expectedValue,actualValue);
    	  
      }
	  @Test
	  public void actualLoopCheckingTest() {
    	  String actualValue=ni.printNthIteration("4");
    	  String expectedValue="1223334444";
    	  assertEquals(expectedValue,actualValue);

	  }
	
}
