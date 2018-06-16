import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SortSumNumberTest {

	 SortSumNumber sn;
	    @Before
	    public void setup(){
	        System.out.println("JUnit Call: @Before setUp");
	        sn=new SortSumNumber();
	    }
	    @Test
	    public void reverseNumTest() {
	    	int expectedNum=654;
	    	int actualNum=sn.reveseNum(456);
	    	assertEquals(expectedNum,actualNum);
	    }
	    @Test
	    public void sumEvenNumberTest() {
	    	ArrayList<Integer> al=new ArrayList<Integer>();
	    	al.add(4);
	    	al.add(5);
	    	al.add(7);
	    	al.add(8);
	    	al.add(4);
	    	int actualCount=sn.sumEvenNumber(al);
	    	int expectedCount=16;
	    	assertEquals(expectedCount,actualCount);
	    	  }
	    @Test
	    public void countSumCheckGreaterTest() {
	    	assertTrue(sn.countSumCheck(20));
	    	
	    }
	    @Test
	    public void countSumCheckLessTest() {
	    	assertFalse(sn.countSumCheck(10));
	    }
}
