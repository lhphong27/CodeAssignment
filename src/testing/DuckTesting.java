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

import animals.Duck;
import utils.Constant;
import utils.Utils;

/**
 * @author Phong
 *
 */
public class DuckTesting {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setupStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStream() {
		System.setOut(System.out);
	}

	@Test
	public void testSay() {
		Duck duck = new Duck();
		duck.say();
		assertEquals(Utils.constructExpectedValue(Constant.DUCK_SAYS), outContent.toString());
	}
	
	@Test
	public void testSwim() {
		Duck duck = new Duck();
		duck.swim();
		assertEquals(Utils.constructExpectedValue(Constant.DUCK_SWIMS), outContent.toString());
	}

}
