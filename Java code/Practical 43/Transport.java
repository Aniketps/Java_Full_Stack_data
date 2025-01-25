import java.util.*;

class Transport
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		ManageVehicles manageVehicles = new ManageVehicles();
		while(true)
		{
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1. New Truck\n2. New Bus\n3. Fuel needed for Truck\n4. Fuel needed for Bus\n5. Distance covered by Truck\n6. Distance Covered by Bus\n7. Display Trucks\n8. Display Buses\n9. Exit()");
			System.out.print("Make choice : ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					manageVehicles.addTruck();
					break;
				case 2:
					manageVehicles.addBus();
					break;
				case 3:
					manageVehicles.FuleNeededForTrucks();
					break;
				case 4:
					manageVehicles.FuleNeededForBuses();
					break;
				case 5:
					manageVehicles.DistanceConveredByTrucks();
					break;
				case 6:
					manageVehicles.DistanceConveredByBuses();
					break;
				case 7:
					manageVehicles.displayTruck();
					break;
				case 8:
					manageVehicles.displayBus();
					break;
				case 9:
					System.exit(0);
					break;
				default:
					System.out.println("Invalit Input");			
			}
		}
	}
}