import java.util.*;

class Truck extends Vehicle
{
	protected int CargoWeightLimit;
	
	Truck(int CargoWeightLimit)
	{
		this.CargoWeightLimit = CargoWeightLimit;
	}
	Truck(){}

	void setCargoWeightLimit(int CargoWeightLimit)
	{
		this.CargoWeightLimit = CargoWeightLimit;
	}
	int getCargoWeightLimit()
	{
		return CargoWeightLimit;
	}
	void display()
	{
		super.display();
		System.out.println("\t\t"+CargoWeightLimit);
	}
}