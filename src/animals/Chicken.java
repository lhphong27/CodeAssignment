/**
 * 
 */
package animals;

import utils.Constant;

/**
 * @author Windy
 *
 */
public class Chicken extends Animal {

	@Override
	public void say() {
		System.out.println(Constant.CHICKEN_SAYS);
	}
}
