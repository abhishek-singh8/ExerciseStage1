import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ConsonantAndVowelTest {

	@Test
	public void checkVowelAndConsonantTest() {
		/* Arrange */
		ConsonantAndVowel cv=new ConsonantAndVowel();
		/* Act */
		ArrayList<String> actualList=cv.checkVowelAndConsonant("abhi");
		ArrayList<String> expectedList=new ArrayList<String>();
		expectedList.add("a is vowel");
		expectedList.add("b is consonant");
		expectedList.add("h is consonant");
		expectedList.add("i is vowel");
		/* Assert */
		assertEquals(expectedList,actualList);
	}

}
