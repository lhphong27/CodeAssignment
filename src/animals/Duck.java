/**
 * 
 */
package animals;

import utils.Constant;

/**
 * @author Windy
 *
 */
public class Duck extends Bird {

	public static void say() {
		System.out.println(Constant.DUCK_SAYS);
	}
	
	public static void fly() {
		System.out.println(Constant.FLY);
	}

	public void swim() {
		System.out.println(Constant.SWIMS);
	}
}
