# CodeAssignment

Section A, Question 1.b: I did some changes to optimize the code:
- Declare the string values in Constant class to make it unique at any places I used. Easier to change if needed.
- Put the model classes and main class in different packages. And use public access modifier to access those methods in different packages.

Section A, Question 3.b: The rooster is the child class of the Chicken, a specific type of chicken.

Section A, Question 3.c: We can use composition to model the rooster.

Section A, Question 4.d: I implemented a property called word. So when creating an instance of class Parrot, we will teach it what to say (or place it near the object we want) by using setter method. This way we can put it whenever we want.

Section B, Question 3.b: I used composition for class Dolphin to implement the method swim(). But I created an instance of Fish and used swim() method of Fish instead of implement an exactly the same method for class Dolphin.

	