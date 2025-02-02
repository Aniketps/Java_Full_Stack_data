/*

4. Car Mileage Calculator
Create a Car class with fields make, model, milesDriven, and fuelUsed. Add a method to calculate mileage (milesDriven / fuelUsed).
Explanation: Ensure proper handling of edge cases like zero fuel.

*/
import java.util.*;

class MilCalCar
{
	public static void main(String ...a)
	{
		Car car = new Car();
		car.showCar();
		car.mileage();
	}
}