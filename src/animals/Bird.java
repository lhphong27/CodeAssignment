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
	
	//not all the birds can fly
	static void fly() {
		System.out.println(Constant.FLY);
	}

	public void sing() {
		System.out.println(Constant.SING);
	}
	
	public static void walk() {
		System.out.println(Constant.ANIMAL_WALKS);
	}
}
