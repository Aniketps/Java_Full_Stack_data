import java.util.*;

class Car
{
	private String Model;
	private int MilesDriven;
	private int FuelUsed;
	
	Car()
	{
		Model = "2015";
		MilesDriven = 50;
		FuelUsed = 2;
	}
	
	void showCar()
	{
		System.out.println("Model : "+Model);
		System.out.println("Miles Driven by car : "+MilesDriven);
		System.out.println("Fuel used by car : "+FuelUsed);
	}
	void mileage()
	{
		System.out.println("The car mileage is : "+MilesDriven/FuelUsed);
	}
}