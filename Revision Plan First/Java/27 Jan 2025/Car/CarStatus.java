/*

1. Create a Car class
Create a Car class with fields speed and fuel.
The default constructor should initialize speed to 60 and fuel to 50.
Add a method drive() to simulate fuel reduction by 10 units per drive, and display the updated fuel level.
Explanation: Simulates state changes in objects through method logic.

*/
import java.util.*;

class CarStatus
{
	public static void main(String ...a)
	{
		Car car = new Car();
		car.showFuel();
		car.drive();
		car.showFuel();
		car.drive();
		car.showFuel();
		car.drive();
		car.showFuel();
		car.drive();
		car.showFuel();
		car.drive();
		car.showFuel();
		car.drive();
		car.showFuel();
	}
}