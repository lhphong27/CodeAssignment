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

import animals.Shark;
import utils.Constant;
import utils.Utils;

/**
 * @author Phong
 *
 */
public class SharkTesting {
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
		Shark shark = new Shark();
		shark.eatOtherFish();
		assertEquals(Utils.constructExpectedValue(Constant.EAT_OTHER_FISH), outContent.toString());
	}
	
	@Test
	public void testProperties() {
		Shark shark = new Shark();
		assertEquals(Constant.COLOUR_GREY, shark.getColor());
		assertEquals(Constant.BODYTYPE_LARGE, shark.getBodyType());
	}
}
