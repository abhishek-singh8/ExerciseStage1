import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class CheckPalindromeTest {

	  CheckPalindrome cc;
	    @Before
	    public void setup(){
	        System.out.println("JUnit Call: @Before setUp");
	        cc=new CheckPalindrome();
	    }
	    @Test
	    public void checkPalindromeTest() {
	    	cc=new CheckPalindrome();
	    	assertTrue(cc.checkPalindrome(242));
	    }
	    @Test
	    public void checkNotPalindromeTest() {
	    	cc=new CheckPalindrome();
	    	assertFalse(cc.checkPalindrome(24898));
	    }
	    @Test
	    public void palindromeSumTest() {
	    	ArrayList<Integer>al=new ArrayList<Integer>();
	    	al.add(2);
	    	al.add(4);
	    	al.add(5);
	    	al.add(7);
	    	cc=new CheckPalindrome();
	    	String actualString=cc.palindromeSum(al);
	    	String expectedString="Palindrome but even count is less than 25";
	    	assertEquals(expectedString,actualString);
	    	
	    }
	    

}
