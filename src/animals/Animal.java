/**
 * Animals class
 */
package animals;

import utils.Constant;

//should be public to be used by other classes in different packages
/**
 * @author Windy
 *
 */
public class Animal {
	//not all animals can walk
	static void walk() {
		System.out.println(Constant.ANIMAL_WALKS);
	}

	static void say() {
		System.out.println(Constant.ANIMAL_SAYS);
	}
}
