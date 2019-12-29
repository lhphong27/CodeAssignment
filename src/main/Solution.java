/**
 * Main class
 */
package main;

import animals.Bird;
import animals.Chicken;
import animals.Duck;
import animals.Parrot;
import animals.Rooster;
import utils.Constant;

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
		System.out.println("=====================");

		Parrot parrotWithDogs = new Parrot();
		parrotWithDogs.setWord(Constant.PARROT_WITH_DOGS);
		parrotWithDogs.say();
		System.out.println("=====================");

		// we can create some new instances of Parrot or change the position of this
		// parrot :)
		Parrot parootWithCats = new Parrot();
		parootWithCats.setWord(Constant.PARROT_WITH_CATS);
		parootWithCats.say();
		System.out.println("=====================");

		Parrot parrotWithRooster = new Parrot();
		parrotWithRooster.setWord(Constant.PARROT_NEAR_ROOSTER);
		parrotWithRooster.say();
		System.out.println("=====================");
	}
}
