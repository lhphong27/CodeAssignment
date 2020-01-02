/**
 * 
 */
package animals;

import utils.Constant;

/**
 * @author Windy
 *
 */
public class Rooster extends Chicken {

	// Override say() method of Chicken
	public static void say() {
		System.out.println(Constant.ROOSTER_SAYS);
	}
}
