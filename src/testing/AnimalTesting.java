/**
 * JUnit testing for Animals class
 */
package testing;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import animals.Animal;

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
		Animal animal = new Animal();
		animal.walk();
		//Due to the method System.out.println() => Added newline character at the end of expected string
		assertEquals("I am walking\r\n", outContent.toString());
	}
}
