// 6. Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.

import java.util.*;

class Animal1
{
	void move()
	{
		System.out.println("Animal Moves");
	}
}

class Cheetah extends Animal1
{
	void move()
	{
		System.out.println("Cheetah Runs");
	}
}

class AnimalMove
{
	public static void main(String ...x)
	{
		Cheetah cheetah = new Cheetah();
		cheetah.move();
	}
}