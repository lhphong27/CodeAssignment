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

	public void walk() {
		System.out.println(Constant.ANIMAL_WALKS);
	}

	public void say() {
		System.out.println(Constant.ANIMAL_SAYS);
	}
}
