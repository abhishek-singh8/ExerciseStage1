import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberGuessTest {
	NumberGuess ng;
	  @Before
	    public void setup(){
	       // System.out.println("JUnit Call: @Before setUp");
	        ng=new NumberGuess();
	    }
	  @Test
	  public void userInputNotNumber() {
		  String actualString=ng.guessTargetnumber("ab");
		  String expectedString="Given input is not a number";
		  assertEquals(expectedString,actualString);
	  }
	  @Test
	  public void userInputRange() {
		  String actualString=ng.guessTargetnumber("56");
		  String expectedString="User Input is out of range";
		  assertEquals(expectedString,actualString);
	  }
	  @Test
	  public void userInputGreater() {
		  String actualString=ng.guessTargetnumber("40");
		  String expectedString="Your number is greater than the target";
		  assertEquals(expectedString,actualString);
	  }
	  @Test
	  public void userInputLess() {
		  String actualString=ng.guessTargetnumber("30");
		  String expectedString="Your number is less than the target";
		  assertEquals(expectedString,actualString);
	  }
}
