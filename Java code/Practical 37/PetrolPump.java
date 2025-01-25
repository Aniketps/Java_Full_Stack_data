import java.util.*;

class PetrolPump
{
public static void main(String x[])
{
	Scanner sc = new Scanner(System.in);
	ManagePetrolPump managePetrolPump = new ManagePetrolPump();
	while(true)
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("1. Default Machine Capacity\n2. Select machine capacity\n3. Add Machine \n4. Machine Count \n5. Machine Capacity \n6. Show Only machine of fuel type\n7. Exit");
		System.out.print("Make Choice : ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
			case 1:
				managePetrolPump= new ManagePetrolPump();
				break;
			case 2:
				System.out.print("Petrol Pump capacity : ");
				int capacity = sc.nextInt();
				managePetrolPump = new ManagePetrolPump(capacity);
				break;
			case 3:
				managePetrolPump.addMachine();
				break;
			case 4:
				System.out.println("The count of machine is : "+managePetrolPump.getMachineCount());
				break;
			case 6:
				System.out.println("1. Petrol\n2. Diesel");
				System.out.print("Make Choice : ");
				int choice1 = sc.nextInt();
				sc.nextLine();
				switch(choice1)
				{
					case 1:
						for(Machine m: managePetrolPump.getMachineByFuelType("Petrol"))
						{
							if(m==null){break;}
							System.out.println(m.getID()+"\t\t"+m.getName()+"\t\t"+m.getFuelType()+"\t\t"+m.getMachineNum()+"\t\t"+m.getMachineCapacity());
						}
						break;
					case 2:
						for(Machine m: managePetrolPump.getMachineByFuelType("Diesel"))
						{
							if(m==null){break;}
							System.out.println(m.getID()+"\t\t"+m.getName()+"\t\t"+m.getFuelType()+"\t\t"+m.getMachineNum()+"\t\t"+m.getMachineCapacity());
						}
						break;
					default:
						System.out.println("Invalit Input");
				}
				break;
			case 5:
				managePetrolPump.getCapacity();
				break;
			case 7:
				System.out.println("Thanks for using our service :)");
				System.exit(0);
		}
	}
}
}