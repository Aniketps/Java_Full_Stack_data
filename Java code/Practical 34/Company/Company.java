// Q2. WAP to create the class name as Employee with a setter and getter method with a Employee details using id, name, email, contact, address, salary.

import java.util.*;
class Company
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		ManagesCompany managesCompany = new ManagesCompany();
		do
		{
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1. Add Employee Details.\n2. Show Employee Details.\n3. Search Employee Using\n4. Delete Employee Details Using.\n5. Update Employee Details Using.\n6. Sorting Employee Details Using.\n7. Show details of employee in specific salary\n8. Exit.");
			System.out.print("Please make a choice : ");
			int option = sc.nextInt();
			sc.nextLine();
			switch(option)
			{
				case 1:
					managesCompany.setEmployeeDetails();
					break;
				case 2:
					managesCompany.showEmployees();
					break;
				case 3:
					System.out.println("1. UID\n2. Name\n3. Salary\n4. Address\n5. Email");
					System.out.print("Make a choice : ");
					int choice1 = sc.nextInt();
					sc.nextLine();
					switch(choice1)
					{
						case 1:
							managesCompany.searchByID();
							break;
						case 2:
							managesCompany.searchByName();
							break;
						case 3:
							managesCompany.searchBySalary();
							break;
						case 4:
							managesCompany.searchByAddress();
							break;
						case 5:
							managesCompany.searchByEmail();
							break;
						default:
							System.out.println("Invalid Input");
					}
					break;
				case 4:
					System.out.println("1. UID\n2. Name\n3. Salary\n4. Address\n5. Email");
					System.out.print("Make a choice : ");
					int choice2 = sc.nextInt();
					sc.nextLine();
					switch(choice2)
					{
						case 1:
							managesCompany.DeleteByID();
							break;
						case 2:
							managesCompany.DeleteByName();
							break;
						case 3:
							managesCompany.DeleteBySalary();
							break;
						case 4:
							managesCompany.DeleteByAddress();
							break;
						case 5:
							managesCompany.DeleteByEmail();
							break;
						default:
							System.out.println("Invalid Input");
					}
					break;
				case 5:
					System.out.println("1. UID\n2. Name\n3. Salary\n4. Address\n5. Email");
					System.out.print("Make a choice : ");
					int choice3 = sc.nextInt();
					sc.nextLine();
					switch(choice3)
					{
						case 1:
							managesCompany.updateEmployeeDetailsByID();
							break;
						case 2:
							managesCompany.updateEmployeeDetailsByName();
							break;
						case 3:
							managesCompany.updateEmployeeDetailsBySalary();
							break;
						case 4:
							managesCompany.updateEmployeeDetailsByAddress();
							break;
						case 5:
							managesCompany.updateEmployeeDetailsByEmail();
							break;
						default:
							System.out.println("Invalid Input");
					}
					break;
				case 6:
					System.out.println("1. Sort by UID\n2. Sort by Salary");
					System.out.print("Make choice : ");
					int choice4 = sc.nextInt();
					sc.nextLine();
					switch(choice4)
					{
						case 1:
							managesCompany.sortByID();
							break;
						case 2:
							managesCompany.sortBySalary();
							break;
						default:
							System.out.println("Invalit Input");
					}
					break;
				case 7:
					managesCompany.showSpecificRangeSalary();
					break;
				case 8:
					System.out.println("Thanks for using our service :)");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Input");
			}
		}
		while(true);
	}
}