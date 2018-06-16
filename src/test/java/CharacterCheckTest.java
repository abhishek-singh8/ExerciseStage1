import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CharacterCheckTest {
    CharacterCheck cc;
    @Before
    public void setup(){
        System.out.println("JUnit Call: @Before setUp");
        cc=new CharacterCheck();
    }
	@Test
	public void test() {
		// fail("Not yet implemented");
		assertTrue(true);
	}
	@Test 
	public void inputLengthTest() {
		String expectedString="Invalid character input";
		String actualString=cc.inputLength("ab");
		assertEquals(expectedString, actualString);
	}

	@Test
	public void charTypeCheckCaptialTest() {
		/* Act */
		String actualString = cc.checkTypeChar('A');
		String expectedString = "A is a Capital letter";
		/* Assert */
		assertEquals(expectedString, actualString);
	}
	@Test
	public void charTypeCheckSmallTest() {
		/* Act */
		String actualString = cc.checkTypeChar('a');
		String expectedString = "a is a small letter";
		/* Assert */
		assertEquals(expectedString, actualString);
	}
	@Test
	public void charTypeCheckNumberTest() {
		/* Act */
		String actualString = cc.checkTypeChar('2');
		String expectedString = "2 is a number";
		/* Assert */
		assertEquals(expectedString, actualString);
	}
	@Test
	public void charTypeCheckSpecialTest() {
		/* Act */
		String actualString = cc.checkTypeChar('$');
		String expectedString = "$ is a special character";
		/* Assert */
		assertEquals(expectedString, actualString);
	}

}
