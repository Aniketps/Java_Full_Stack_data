// 1. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

import java.util.*;

class Animal
{
	void makeSound()
	{
		System.out.println("Animal Called");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat is Barking");
	}
}

class AnimalSound
{
	public static void main(String ...x)
	{
		Cat cat = new Cat();
		cat.makeSound();
	}
}