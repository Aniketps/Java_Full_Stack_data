/*

4. Hotel Staff Management
Create a Staff POJO class with fields: staffID, name, role, and salary.
Create a HotelManagement class that:
Adds staff members.
Calculates the total salary of all staff.
Lists all staff members in a specific role (e.g., manager, housekeeper).

*/

import java.util.*;

class Hotel
{
	public static void main(String ...a)
	{
		HotelManagement hotelManagement = new HotelManagement();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1. Add Staff\n2. Show Staff\n3. Exit()");
			System.out.print("Make a choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					hotelManagement.addStaff();
					break;
				case 2:
					hotelManagement.showStaff();
					break;
				case 3:
					System.out.println("See you later :)");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Input");
			}
		}
	}
}