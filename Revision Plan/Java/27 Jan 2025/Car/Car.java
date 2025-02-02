import java.util.*;

class Car
{
	private int Speed;
	private int Fuel;

	Car()
	{
		Speed = 60;
		Fuel = 50;
	}
	
	void drive()
	{
		if(Fuel <= 0)
		{
			System.out.println("No Fuel, Please refill...");
			return;
		}
		System.out.println("Driving... 10% fuel reduction");
		Fuel = Fuel - 10;
	}

	void showFuel()
	{
		if(Fuel < 0)
		{
			System.out.println("No Fuel, Please refill...");
			return;
		}
		System.out.println("Current fuel remain is : "+Fuel);
	}
}