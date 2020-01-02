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

import animals.Frog;
import utils.Constant;
import utils.Utils;

/**
 * @author Phong
 *
 */
public class FrogTesting {
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
		Frog frog = new Frog();
		frog.say();
		assertEquals(Utils.constructExpectedValue(Constant.SOUND_OF_FROG), outContent.toString());
		outContent.reset();
		
		frog.walk();
		assertEquals(Utils.constructExpectedValue(Constant.ANIMAL_WALKS), outContent.toString());
		
	}

}
