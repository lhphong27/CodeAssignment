/**
 * 
 */
package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import animals.Shark;

/**
 * @author Phong
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ AnimalTesting.class, BirdTesting.class, ChickenTesting.class, DuckTesting.class, 
	ParrotTesting.class, RoosterTesting.class, SharkTesting.class, ClownfishTesting.class,
	FishTesitng.class, DolphinTesting.class, CaterpilarTesting.class, ButterflyTesting.class,
	CatTesting.class, DogTesting.class, FrogTesting.class})
public class AllTests {

}
