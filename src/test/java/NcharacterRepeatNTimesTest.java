import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NcharacterRepeatNTimesTest {
	NcharacterRepeatNTimes ni;
	  @Before
	    public void setup(){
	       // System.out.println("JUnit Call: @Before setUp");
	        ni=new NcharacterRepeatNTimes();
	    }
	  @Test
	  public void invalidNumber() {
		  String actualString=ni.lastCharRepeat("stackroute", "5ab");
		  String expectedString="Invalid Number input";
		  assertEquals(expectedString,actualString);
	  }
	  @Test
	  public void emptyStringTest() {
		  String actualString=ni.lastCharRepeat("", "5");
		  String expectedString="String cannot be empty";
		  assertEquals(expectedString,actualString);
	  }
	  @Test
	  public void numberGreaterThanStringTest() {
		  String actualString=ni.lastCharRepeat("stackroute", "12");
		  String expectedString="n is Greater than length not possible";
		  assertEquals(expectedString,actualString);
	  }
	  @Test
	  public void lastCharRepeatTest() {
		  String actualString=ni.lastCharRepeat("stackroute", "5");
		  String expectedString="stackrouterouterouterouterouteroute";
		  assertEquals(expectedString,actualString);
	  }
	  @Test
	  public void numberNegativeTest() {
		  String actualString=ni.lastCharRepeat("stackroute", "-5");
		  String expectedString="Number cannot be negative";
		  assertEquals(expectedString,actualString);
	  }
}
