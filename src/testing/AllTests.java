/**
 * 
 */
package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Phong
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ AnimalTesting.class, BirdTesting.class, ChickenTesting.class, DuckTesting.class, ParrotTesting.class, RoosterTesting.class })
public class AllTests {

}
