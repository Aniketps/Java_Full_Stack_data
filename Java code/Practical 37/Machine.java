import java.util.*;

class Machine
{
	// id,name,fuelType,machineNo,machineCapacity
	// Here are the instance variable to hold my data of machine
	private int ID;
	private String Name;
	private String FuelType;
	private int MachineNum;
	private int MachineCapacity;

	// Set data to instance variable
	void setID(int ID)
	{
		this.ID = ID;
	}
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setFuelType(String FuelType)
	{
		this.FuelType = FuelType;
	}
	void setMachineNum(int MachineNum)
	{
		this.MachineNum = MachineNum;
	}
	void setMachineCapacity(int MachineCapacity)
	{
		this.MachineCapacity = MachineCapacity;
	}

	// Send data for use
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	String getFuelType()
	{
		return FuelType;
	}
	int getMachineNum()
	{
		return MachineNum;
	}
	int getMachineCapacity()
	{
		return MachineCapacity;
	}
}