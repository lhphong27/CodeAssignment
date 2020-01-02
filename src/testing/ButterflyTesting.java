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

import animals.Butterfly;
import utils.Constant;
import utils.Utils;

/**
 * @author Phong
 *
 */
public class ButterflyTesting {
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
		Butterfly butterfly = new Butterfly();
		butterfly.fly();
		assertEquals(Utils.constructExpectedValue(Constant.FLY), outContent.toString());
	}

}
