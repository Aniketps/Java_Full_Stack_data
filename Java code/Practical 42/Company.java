/*

Q5.  Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate is 
	Rs.50/- (per Hour). Daily shift hour time is only 8 hours.

Note- for a week only 40 hours of working are allowed. 
1. Create class Employee with data member ID, Name, total working, salary, overtime
Set Information by using a constructor and create a display Information() method to
display all information with salary.
2. Create Driver class name as OverTime with method setEmployee(Employee emp[]) and 
void calculateOvertime() to calculate overtime.

*/

import java.util.*;

class Company
{
	public static void main(String ...x)
	{

		ManageEmployee manageEmployee = new ManageEmployee();
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1. Add Employee (Max. 5)\n2. Check Employee Status\n3. Exit");
			System.out.print("Make choice :");
			int option = sc.nextInt();
			sc.nextLine();
			switch(option)
			{
				case 1:
					manageEmployee.setEmployee();
					break;
				case 2:
					manageEmployee.showEmployee();
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Input");
			}
		}
	}
}