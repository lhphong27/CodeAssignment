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
import animals.Dolphin;
import utils.Constant;
import utils.Utils;

/**
 * @author Phong
 *
 */
public class DolphinTesting {
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
		Dolphin dolphin = new Dolphin();
		dolphin.swim();
		assertEquals(Utils.constructExpectedValue(Constant.SWIMS), outContent.toString());
	}

}
