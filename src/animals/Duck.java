/**
 * 
 */
package animals;

/**
 * @author Windy
 *
 */
public class Duck extends Animal{
	
	@Override
	public void say() {
		System.out.println("Quack, quack");
	}
	
	public void swim() {
		System.out.println("I am swimming");
	}
}
