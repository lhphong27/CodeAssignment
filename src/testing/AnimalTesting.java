/**
 * JUnit testing for Animals class
 */
package testing;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Windy
 *
 */
public class AnimalTesting {

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
	public void testAnimal() {
//		Animal animal = new Animal();
//		Animal.walk();
		// Due to the method System.out.println() => Added newline character at the end
		// of expected string (\r\n on Windows)
//		assertEquals(Utils.constructExpectedValue(Constant.ANIMAL_WALKS), outContent.toString());
	}
}
