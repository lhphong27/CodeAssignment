/**
 * Main class
 */
package main;

import animals.Bird;
import animals.Chicken;
import animals.Duck;
import animals.Rooster;
/**
 * @author Windy
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		System.out.println("=====================");
		
		Duck duck = new Duck();
		duck.walk();
		duck.say();
		duck.swim();
		System.out.println("=====================");
		
		Chicken chicken = new Chicken();
		chicken.say();
		System.out.println("=====================");
		
		Rooster rooster = new Rooster();
		rooster.walk();
		rooster.say();
	}
}
