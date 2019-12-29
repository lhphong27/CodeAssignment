/**
 * Bird class
 */
package animals;

import utils.Constant;

/**
 * @author Windy
 *
 */
public class Bird extends Animal {

	public void fly() {
		System.out.println(Constant.FLY);
	}

	public void sing() {
		System.out.println(Constant.SING);
	}
}
