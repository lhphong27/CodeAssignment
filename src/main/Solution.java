/**
 * Main class
 */
package main;

import java.util.ArrayList;
import java.util.List;

import animals.Bird;
import animals.Butterfly;
import animals.Cat;
import animals.Caterpillar;
import animals.Chicken;
import animals.ClownFish;
import animals.Dog;
import animals.Dolphin;
import animals.Duck;
import animals.Fish;
import animals.Frog;
import animals.Parrot;
import animals.Rooster;
import animals.Shark;
import utils.Constant;
import utils.Utils;

/**
 * @author Windy
 *
 */
public class Solution {

	public static void main(String[] args) {

//		Bird bird = new Bird();
//		bird.walk();
//		bird.fly();
//		bird.sing();
//		System.out.println("=====================");
//
//		Duck duck = new Duck();
//		duck.walk();
//		duck.say();
//		duck.swim();
//		System.out.println("=====================");
//
//		Chicken chicken = new Chicken();
//		chicken.say();
//		System.out.println("=====================");
//
//		Rooster rooster = new Rooster();
//		rooster.walk();
//		rooster.say();
//		System.out.println("=====================");
//
//		Parrot parrotWithDogs = new Parrot();
//		parrotWithDogs.setWord(Constant.PARROT_WITH_DOGS);
//		parrotWithDogs.say();
//		System.out.println("=====================");
//
//		// we can create some new instances of Parrot or change the position of this
//		// parrot :)
//		Parrot parootWithCats = new Parrot();
//		parootWithCats.setWord(Constant.PARROT_WITH_CATS);
//		parootWithCats.say();
//		System.out.println("=====================");
//
//		Parrot parrotWithRooster = new Parrot();
//		parrotWithRooster.setWord(Constant.PARROT_NEAR_ROOSTER);
//		parrotWithRooster.say();
//		System.out.println("=====================");
//		
//		Shark shark = new Shark();
//		System.out.println("Color: " + shark.getColor() + ", Body Type: " + shark.getBodyType());
//		shark.eatOtherFish();
//		
//		ClownFish clowFish = new ClownFish();
//		System.out.println("Color: " + clowFish.getColor() + ", Body Type: " + clowFish.getBodyType());
//		clowFish.makeJoke();
		
		
//		Object[] animals = new Object[13];//should be dynamic array
//		animals[0] = new Bird();
//		animals[1] = new Duck();
//		animals[2] = new Chicken();
//		animals[3] = new Rooster();
//		animals[4] = new Parrot();
//		animals[5] = new Fish();
//		animals[6] = new Shark();
//		animals[7] = new ClownFish();
//		animals[8] = new Dolphin();
//		animals[9] = new Frog();
//		animals[10] = new Dog();
//		animals[11] = new Butterfly();
//		animals[12] = new Cat();
//		
//		int numberOfAnimalThatCanSwim = Utils.countAninmalByAbility(Constant.ABILITY_SWIM, animals);
//		System.out.println("There is/are " + numberOfAnimalThatCanSwim + " animal(s) that can " + Constant.ABILITY_SWIM);
//		
//		int numberOfAnimalThatCanFly = Utils.countAninmalByAbility(Constant.ABILITY_FLY, animals);
//		System.out.println("There is/are " + numberOfAnimalThatCanFly + " animal(s) that can " + Constant.ABILITY_FLY);
//		
//		int numberOfAnimalThatCanWalk = Utils.countAninmalByAbility(Constant.ABILITY_WALK, animals);
//		System.out.println("There is/are " + numberOfAnimalThatCanWalk + " animal(s) that can " + Constant.ABILITY_WALK);
//		
//		int numberOfAnimalThatCanSing = Utils.countAninmalByAbility(Constant.ABILITY_SING, animals);
//		System.out.println("There is/are " + numberOfAnimalThatCanSing + " animal(s) that can " + Constant.ABILITY_SING);
		
		//it would be better if we use List, we can init the size dynamically
		List<Object> animalList = new ArrayList<Object>();
		animalList.add(new Bird());
		animalList.add(new Duck());
		animalList.add(new Chicken());
		animalList.add(new Rooster());
		animalList.add(new Parrot());
		animalList.add(new Fish());
		animalList.add(new Shark());
		animalList.add(new ClownFish());
		animalList.add(new Dolphin());
		animalList.add(new Frog());
		animalList.add(new Dog());
		animalList.add(new Butterfly());
		animalList.add(new Cat());
		animalList.add(new Caterpillar());
		
		int numberOfAnimalThatCanSwim = Utils.countAninmalByAbility(Constant.ABILITY_SWIM, animalList);
		System.out.println("There is/are " + numberOfAnimalThatCanSwim + " animal(s) that can " + Constant.ABILITY_SWIM);
		System.out.println("====================================");
		
		int numberOfAnimalThatCanFly = Utils.countAninmalByAbility(Constant.ABILITY_FLY, animalList);
		System.out.println("There is/are " + numberOfAnimalThatCanFly + " animal(s) that can " + Constant.ABILITY_FLY);
		System.out.println("====================================");
		
		int numberOfAnimalThatCanWalk = Utils.countAninmalByAbility(Constant.ABILITY_WALK, animalList);
		System.out.println("There is/are " + numberOfAnimalThatCanWalk + " animal(s) that can " + Constant.ABILITY_WALK);
		System.out.println("====================================");
		
		int numberOfAnimalThatCanSing = Utils.countAninmalByAbility(Constant.ABILITY_SING, animalList);
		System.out.println("There is/are " + numberOfAnimalThatCanSing + " animal(s) that can " + Constant.ABILITY_SING);
		System.out.println("====================================");
	}
}
