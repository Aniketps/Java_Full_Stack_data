import java.util.*;

class ManagePetrolPump
{
	Machine machine[];
	int FilledMachines = 0;
	Scanner sc = new Scanner(System.in);
	
	// Here is default constructor to set 5 machines in default when machine object is created
	ManagePetrolPump()
	{
		this(5);
	}
	ManagePetrolPump(int Capacity)
	{
		machine = new Machine[Capacity];
	}
	int getMachineCount()
	{
		int Count = 0;
		for(int i = 0; i<machine.length; i++)
		{
			if(machine[i]==null){ break; }
			Count++;
		}
		return Count;
	}
	void getCapacity()
	{
		System.out.println("ID\t\tName\t\tFuelType\tMachine No\tMachine Capacity");
		for(Machine m: machine)
		{
			if(m==null){ return; }
			System.out.println(m.getID()+"\t\t"+m.getName()+"\t\t"+m.getFuelType()+"\t\t"+m.getMachineNum()+"\t\t"+m.getMachineCapacity());
		}
	}
	Machine[] getMachineByFuelType(String FuelType)
	{
		int Size = 0;
		for(Machine m: machine)
		{
			if(m==null){break;}
			Size++;
		}
		Machine tempMachine[] = new Machine[Size];
		int CurrentMachineCount = 0;
		
		for(Machine m: machine)
		{
			if(m==null){break;}
			if(m.getFuelType().equals(FuelType))
			{
				tempMachine[CurrentMachineCount] = m;
				CurrentMachineCount++;
			}
		}
		return tempMachine;
	}
	int UniqueID = 1;
	void addMachine()
	{
		if(machine.length <= FilledMachines){ System.out.println("Petrol Pump Full "); return;}
		machine[FilledMachines] = new Machine();
		machine[FilledMachines].setID(UniqueID);
		UniqueID++;
	
		System.out.print("Machine name : ");
		machine[FilledMachines].setName(sc.nextLine());

		System.out.println("Machine Fuel Type\n1. Petrol\n2. Diesel");
		System.out.print("Make Choice :");
		int option = sc.nextInt();
		sc.nextLine();
		switch(option)
		{
			case 1:
				machine[FilledMachines].setFuelType("Petrol");
				break;
			case 2:
				machine[FilledMachines].setFuelType("Diesel");
				break;
			default:
				machine[FilledMachines].setFuelType("Petrol");
		}

		System.out.print("Machine Machine number : ");
		machine[FilledMachines].setMachineNum(sc.nextInt());
		sc.nextLine();

		System.out.print("Machine Machine capacity : ");
		machine[FilledMachines].setMachineCapacity(sc.nextInt());
		sc.nextLine();

		FilledMachines++;
		System.out.println("Machine Added Successfully");
		
	}
}