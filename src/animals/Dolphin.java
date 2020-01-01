/**
 * 
 */
package animals;

/**
 * @author Phong
 *
 */
public class Dolphin{// check extends
	//use composition instead of inheritance
	public void swim() {
		Fish fish = new Fish();
		fish.swim();
	}
}
