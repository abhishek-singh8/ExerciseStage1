import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OnlyIntegerSumTest {

	OnlyIntegerSum os;
	  @Before
	    public void setup(){
	       // System.out.println("JUnit Call: @Before setUp");
	        os=new OnlyIntegerSum();
	    }
	  @Test
	  public void notValidNumberTest() {
		  String expectedException="Invalid input";
		  String actualException=os.checkForIntegerOnly("43 a 24");
		  assertEquals(expectedException,actualException);
	  }
	  @Test
	  public void sumOfNumberTest() {
		  String actualString=os.checkForIntegerOnly("43 23 24");
		  String expectedString="90";
		  assertEquals(expectedString,actualString);


	  }
}
