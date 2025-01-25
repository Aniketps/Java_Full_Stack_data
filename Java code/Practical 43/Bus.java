import java.util.*;

class Bus extends Vehicle
{
	protected int NoPassengers;

	Bus(int NoPassengers)
	{
		this.NoPassengers = NoPassengers;
	}
	
	Bus(){}

	void setNoPassengers(int NoPassengers)
	{
		this.NoPassengers = NoPassengers;
	}
	int getNoPassengers()
	{
		return NoPassengers;
	}
	void display()
	{
		super.display();
		System.out.println("\t\t"+NoPassengers);
	}
}