/**
 * Main class
 */
package main;

import animals.Bird;
import animals.Chicken;
import animals.ClownFish;
import animals.Duck;
import animals.Fish;
import animals.Parrot;
import animals.Rooster;
import animals.Shark;
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
		
		Shark shark = new Shark();
		System.out.println("Color: " + shark.getColor() + ", Body Type: " + shark.getBodyType());
		shark.eatOtherFish();
		
		ClownFish clowFish = new ClownFish();
		System.out.println("Color: " + clowFish.getColor() + ", Body Type: " + clowFish.getBodyType());
		clowFish.makeJoke();
	}
}
