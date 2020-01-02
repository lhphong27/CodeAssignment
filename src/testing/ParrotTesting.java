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
import animals.Parrot;
import utils.Constant;
import utils.Utils;

/**
 * @author Phong
 *
 */
public class ParrotTesting {
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
		Parrot parrot = new Parrot();
		parrot.setWord(Constant.SOUND_OF_DOG);
		parrot.say();
		assertEquals(Utils.constructExpectedValue(Constant.SOUND_OF_DOG), outContent.toString());
		outContent.reset();
		
		parrot.setWord(Constant.SOUND_OF_CAT);
		parrot.say();
		assertEquals(Utils.constructExpectedValue(Constant.SOUND_OF_CAT), outContent.toString());
		outContent.reset();
		
		parrot.setWord(Constant.SOUND_OF_ROOSTER);
		parrot.say();
		assertEquals(Utils.constructExpectedValue(Constant.SOUND_OF_ROOSTER), outContent.toString());		
	}

}
