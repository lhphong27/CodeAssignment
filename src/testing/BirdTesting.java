package testing;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import animals.Bird;
import utils.Constant;
import utils.Utils;

/**
 * @author Windy
 *
 */
public class BirdTesting {

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
	public void testBird() throws IOException {
		Bird bird = new Bird();

		Bird.walk();
		assertEquals(Utils.constructExpectedValue(Constant.ANIMAL_WALKS), outContent.toString());
		outContent.reset();

		bird.sing();
		assertEquals(Utils.constructExpectedValue(Constant.SING), outContent.toString());
	}
}
