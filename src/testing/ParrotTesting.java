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

import animals.Parrot;
import utils.Constant;
import utils.Utils;

/**
 * @author Phong
 *
 */
public class ParrotTesting {
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
		Parrot parrot = new Parrot();
		parrot.setWord(Constant.PARROT_WITH_DOGS);
		parrot.say();
		assertEquals(Utils.constructExpectedValue(Constant.PARROT_WITH_DOGS), outContent.toString());
		outContent.reset();
		
		parrot.setWord(Constant.PARROT_WITH_CATS);
		parrot.say();
		assertEquals(Utils.constructExpectedValue(Constant.PARROT_WITH_CATS), outContent.toString());
		outContent.reset();
		
		parrot.setWord(Constant.PARROT_NEAR_ROOSTER);
		parrot.say();
		assertEquals(Utils.constructExpectedValue(Constant.PARROT_NEAR_ROOSTER), outContent.toString());		
	}

}
