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
import animals.Rooster;
import utils.Constant;
import utils.Utils;

/**
 * @author Phong
 *
 */
public class RoosterTesting {
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
		Rooster rooster = new Rooster();
		rooster.say();
		assertEquals(Utils.constructExpectedValue(Constant.ROOSTER_SAYS), outContent.toString());
	}

}
