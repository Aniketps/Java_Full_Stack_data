import java.util.*;

class Vehicle
{
	protected String VeihicleModel;
	protected String RegistrationNumber;
	protected int VehicleSpeed;
	protected int FuelCapacity;
	protected int Consumption;

	Scanner sc = new Scanner(System.in);

	Vehicle(String VeihicleModel, String RegistrationNumber, int VehicleSpeed, int FuelCapacity, int Consumption)
	{
		
	}
	Vehicle(){}

	int fuelNeeded(int Distance)
	{

		if(Consumption == 0)
		{
			System.out.println("Consumption is not set");
			return 0;
		}
		
		return (Distance/Consumption);
	}

	int distanceCovered(int Hours)
	{
		int Distance = VehicleSpeed*Hours;
		return Distance;
	}

	void display()
	{
		System.out.print(VeihicleModel+"\t\t"+RegistrationNumber+"\t\t\t"+VehicleSpeed+"\t\t"+FuelCapacity+"\t\t"+Consumption);
	}
	
	void setVeihicleModel(String VeihicleModel)
	{
		this.VeihicleModel = VeihicleModel;
	}
	void setRegistrationNumber(String RegistrationNumber)
	{
		this.RegistrationNumber = RegistrationNumber;
	}
	void setVehicleSpeed(int VehicleSpeed)
	{
		this.VehicleSpeed = VehicleSpeed;
	}
	void setFuelCapacity(int FuelCapacity)
	{
		this.FuelCapacity = FuelCapacity;
	}
	void setConsumption(int Consumption)
	{
		this.Consumption = Consumption;
	}

	//  Getters
	String getVehicleModel()
	{
		return VeihicleModel;
	}
	String getRegistrationNumber()
	{
		return RegistrationNumber;
	}
	int getVehicleSpeed()
	{
		return VehicleSpeed;
	}
	int getFuelCapacity()
	{
		return FuelCapacity;
	}
	int getConsumption()
	{
		return Consumption;
	}
}