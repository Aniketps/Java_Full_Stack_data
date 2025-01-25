// 2. Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

import java.util.*;

class Vehicle
{
	void drive()
	{
		System.out.println("Vehicle called");
	}
}

class Car
{
	void drive()
	{
		System.out.println("Repairing a car");
	}
}

class VehicleRepairing
{
	public static void main(String ...x)
	{
		Car car = new Car();
		car.drive();
	}
}