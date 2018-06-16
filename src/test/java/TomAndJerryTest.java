import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TomAndJerryTest {
	TomAndJerry tc;
	   @Before
	    public void setup(){
	       // System.out.println("JUnit Call: @Before setUp");
	        tc=new TomAndJerry();
	    }
	   @Test
	   public void evenCheckTest() {
		   assertTrue(tc.evenCheck(24));
	   }
	 
	   @Test
	   public void oddCheckTest() {
		   assertTrue(tc.oddCheck(29));
	   }
	  
	   @Test
	   public void outOfRangeCheckTest() {
		   String actualValue=tc.rangeCheck(210);
		   String expectedValue="out Of Range";
		   assertEquals(expectedValue,actualValue);
	   }
	   @Test
	   public void rangeTomCheckTest() {
		   String actualValue=tc.rangeCheck(22);
		   String expectedValue="Tom";
		   assertEquals(expectedValue,actualValue); 
	   }
	   @Test
	   public void rangeJerryCheckTest() {
		   String actualValue=tc.rangeCheck(23);
		   String expectedValue="Jerry";
		   assertEquals(expectedValue,actualValue); 
	   }
}
