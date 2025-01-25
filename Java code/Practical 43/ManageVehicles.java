import java.util.*;

class ManageVehicles
{
	Truck truck[] = new Truck[100];
	Bus bus[] = new Bus[100];

	int CurrentBusCount = 0;
	int CurrentTruckCount = 0;
	int maxBusCount = 100;
	int maxTruckCount = 100;

	Scanner sc = new Scanner(System.in);
	
	void addTruck()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		truck[CurrentTruckCount] = new Truck();

		System.out.print("Truck Model number : ");
		truck[CurrentTruckCount].setVeihicleModel(sc.nextLine());

		System.out.print("Truck Registration Number: ");
		truck[CurrentTruckCount].setRegistrationNumber(sc.nextLine());

		System.out.print("Truck Speed (Km/Hours) : ");
		truck[CurrentTruckCount].setVehicleSpeed(sc.nextInt());

		System.out.print("Truck Fuel Capacity (Liters) : ");
		truck[CurrentTruckCount].setFuelCapacity(sc.nextInt());
		sc.nextLine();

		System.out.print("Truck Fuel Consumption (Km/Liters) : ");
		truck[CurrentTruckCount].setConsumption(sc.nextInt());
		sc.nextLine();

		System.out.print("Truck Cargo Weight Limit (Kg) : ");
		truck[CurrentTruckCount].setCargoWeightLimit(sc.nextInt());
		sc.nextLine();
		
		CurrentTruckCount++;
	}

	void addBus()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		bus[CurrentBusCount] = new Bus();

		System.out.print("Bus Model number : ");
		bus[CurrentBusCount].setVeihicleModel(sc.nextLine());

		System.out.print("Bus Registration Number: ");
		bus[CurrentBusCount].setRegistrationNumber(sc.nextLine());

		System.out.print("Bus Speed (Km/Hours) : ");
		bus[CurrentBusCount].setVehicleSpeed(sc.nextInt());
		sc.nextLine();		

		System.out.print("Bus Fuel Capacity (Liters) : ");
		bus[CurrentBusCount].setFuelCapacity(sc.nextInt());
		sc.nextLine();

		System.out.print("Bus Fuel Consumption (Km/Liters) : ");
		bus[CurrentBusCount].setConsumption(sc.nextInt());
		sc.nextLine();

		System.out.print("Bus No of Passengers : ");
		bus[CurrentBusCount].setNoPassengers(sc.nextInt());
		sc.nextLine();
		
		CurrentBusCount++;
	}

	void displayTruck()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Veihicle Model\tRegistration Number\tVehicle Speed\tFuel Capacity\tConsumption\tCargo Weight Limit");
		for(Truck t: truck)
		{
			if(t==null){return;}
			t.display();
		}
	}
	void displayBus()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Veihicle Model\tRegistration Number\tVehicle Speed\tFuel Capacity\tConsumption\tNo of Passengers");
		for(Bus b: bus)
		{
			if(b==null){return;}
			b.display();
		}
	}
	void DistanceConveredByBuses()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("The time under which you want to reach destiny( In hours ) : ");
		int Hours = sc.nextInt();
		sc.nextLine();
		System.out.println("Veihicle Model\tDistance Covered");
		for(Bus b: bus)
		{
			if(b==null){return;}
			System.out.println(b.getVehicleModel()+"\t\t"+b.distanceCovered(Hours));
		}
	}
	void DistanceConveredByTrucks()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("The time under which you want to reach destiny( In hours ) : ");
		int Hours = sc.nextInt();
		sc.nextLine();

		System.out.println("Veihicle Model\tDistance Covered");
		for(Truck t: truck)
		{
			if(t==null){return;}
			System.out.println(t.getVehicleModel()+"\t\t"+t.distanceCovered(Hours));
		}
	}
	void FuleNeededForBuses()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Please enter distance(in kilo meter) : ");
		int Distance = sc.nextInt();
		sc.nextLine();
		System.out.println("Veihicle Model\tFuel Needed");
		for(Bus b: bus)
		{
			if(b==null){return;}
			System.out.println(b.getVehicleModel()+"\t\t"+b.fuelNeeded(Distance));
		}
	}
	void FuleNeededForTrucks()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Please enter distance(in kilo meter) : ");
		int Distance = sc.nextInt();
		sc.nextLine();
		System.out.println("Veihicle Model\tFuel Needed");
		for(Truck t: truck)
		{
			if(t==null){return;}
			System.out.println(t.getVehicleModel()+"\t\t"+t.fuelNeeded(Distance));
		}
	}
}