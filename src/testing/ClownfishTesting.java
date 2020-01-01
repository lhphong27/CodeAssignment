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

import animals.ClownFish;
import utils.Constant;
import utils.Utils;

/**
 * @author Phong
 *
 */
public class ClownfishTesting {
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
	public void test() {
		ClownFish clownFish = new ClownFish();
		clownFish.makeJoke();
		assertEquals(Utils.constructExpectedValue(Constant.MAKE_JOKE), outContent.toString());
	}
	
	@Test
	public void testProperties() {
		ClownFish clownFish = new ClownFish();
		assertEquals(Constant.COLOUR_ORANGE, clownFish.getColor());
		assertEquals(Constant.BODYTYPE_SMALL, clownFish.getBodyType());
	}

}
