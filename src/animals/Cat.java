/**
 * 
 */
package animals;

import utils.Constant;

/**
 * @author Phong
 *
 */
public class Cat extends Animal{
	public static void walk() {
		System.out.println(Constant.ANIMAL_WALKS);
	}
	
	public static void say() {
		System.out.println(Constant.SOUND_OF_CAT);
	}
}
