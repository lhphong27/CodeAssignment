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

import animals.Chicken;
import utils.Constant;
import utils.Utils;

/**
 * @author Phong
 *
 */
public class ChickenTesting {

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
		Chicken chicken = new Chicken();
		chicken.say();
		assertEquals(Utils.constructExpectedValue(Constant.CHICKEN_SAYS), outContent.toString());
	}

}
