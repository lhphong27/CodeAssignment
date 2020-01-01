/**
 * 
 */
package animals;

import utils.Constant;

/**
 * @author Windy
 *
 */
public class Duck extends Animal {

	@Override
	public void say() {
		System.out.println(Constant.DUCK_SAYS);
	}

	public void swim() {
		System.out.println(Constant.SWIMS);
	}
}
