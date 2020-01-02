/**
 * 
 */
package testing;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import animals.Cat;
import utils.Constant;
import utils.Utils;

/**
 * @author Phong
 *
 */
public class CatTesting {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setupStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStream() {
		System.setOut(System.out);
	}

	@SuppressWarnings("static-access")
	@Test
	public void test() {
		Cat cat = new Cat();
		cat.say();
		assertEquals(Utils.constructExpectedValue(Constant.SOUND_OF_CAT), outContent.toString());
		outContent.reset();
		cat.walk();
		assertEquals(Utils.constructExpectedValue(Constant.ANIMAL_WALKS), outContent.toString());
		
	}

}
