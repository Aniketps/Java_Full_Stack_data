import java.util.*;
class ManagesCompany
{
	private Employee employee[] = new Employee[100];
	private int CurrentEmployeeCount = 0;
	private int MaxEmployeeCount = 100;
		
	Scanner sc  = new Scanner(System.in);
	
	void setEmployeeDetails()
	{
		employee[CurrentEmployeeCount] = new Employee();
		System.out.println("-------------------------------------------------------------------------------------");
		boolean isUnique = true;
		int ID;
		do
		{
			isUnique = true;
			System.out.print("Please enter Employee UID : ");
			ID = sc.nextInt();
			sc.nextLine();
			for(int i = 0; i<CurrentEmployeeCount; i++)
			{
				if(employee[i].getID()==ID)
				{
					System.out.println("Employee with "+ID+" UID already exist in database try another UID");
					isUnique = false;
				}
			}
		}while(!isUnique);
		employee[CurrentEmployeeCount].setID(ID);

		System.out.print("Name of an Employee : ");
		String Name = sc.nextLine();
		employee[CurrentEmployeeCount].setName(Name);

		System.out.print("Email of an Employee : ");
		String Email = sc.nextLine();
		employee[CurrentEmployeeCount].setEmail(Email);

		System.out.print("Salary of an Employee : ");
		int Salary= sc.nextInt();
		sc.nextLine();
		employee[CurrentEmployeeCount].setSalary(Salary);

		System.out.print("Address of an Employee : ");
		String Address = sc.nextLine();
		employee[CurrentEmployeeCount].setAddress(Address);

		CurrentEmployeeCount++;
		System.out.println("Employee record saved successfully");
	}
	void showEmployees()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getEmail()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getAddress());
		}
	}
	void searchByID()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Enter UID : ");
		int ID = sc.nextInt();
		sc.nextLine();
		boolean isFound = false;
		System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getID()==ID)
			{
				System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getEmail()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getAddress());
				isFound = true;
			}
		}
		if(!isFound)
		{
			System.out.println("Employee with "+ID+" is not available is data");
		}
	}

	void searchByName()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Enter Name : ");
		String Name = sc.nextLine();
		
		boolean isFound = false;
		System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getName().equals(Name))
			{
				System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getEmail()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getAddress());
				isFound = true;
			}
		}
		if(!isFound)
		{
			System.out.println("Employee with "+Name+" is not available is data");
		}
	}
	void searchByEmail()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Enter Email : ");
		String Email = sc.nextLine();
		boolean isFound = false;
		System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getEmail().equals(Email))
			{
				System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getEmail()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getAddress());
				isFound = true;
			}
		}
		if(!isFound)
		{
			System.out.println("Employee with "+Email+" is not available is data");
		}
	}

	void searchBySalary()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Enter Salary : ");
		int Salary = sc.nextInt();
		sc.nextLine();
		boolean isFound = false;
		System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getSalary()==Salary)
			{
				System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getEmail()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getAddress());
				isFound = true;
			}
		}
		if(!isFound)
		{
			System.out.println("Employee with "+Salary+" is not available is data");
		}
	}
	void searchByAddress()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Enter Address : ");
		String Address = sc.nextLine();
		boolean isFound = false;
		System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getAddress().equals(Address))
			{
				System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getEmail()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getAddress());
				isFound = true;
			}
		}
		if(!isFound)
		{
			System.out.println("Employee with "+Address+" is not available is data");
		}
	}

	void DeleteByID()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Enter UID : ");
		int ID = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getID() == ID)
			{
				for(int j = i; j<CurrentEmployeeCount-1;j++)
				{
					employee[j] = employee[j+1];
				}
				i--;
				CurrentEmployeeCount--;
			}
		}
		System.out.println("All recored with UID "+ID+" has been deleted");
	}
	void DeleteByName()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Enter Name : ");
		String Name = sc.nextLine();
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getName().equals(Name))
			{
				for(int j = i; j<CurrentEmployeeCount-1;j++)
				{
					employee[j] = employee[j+1];
				}
				i--;
				CurrentEmployeeCount--;
			}
		}
		System.out.println("All recored with Name "+Name+" has been deleted");
	}
	void DeleteByEmail()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Enter Email : ");
		String Email = sc.nextLine();
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getEmail().equals(Email))
			{
				for(int j = i; j<CurrentEmployeeCount-1;j++)
				{
					employee[j] = employee[j+1];
				}
				i--;
				CurrentEmployeeCount--;
			}
		}
		System.out.println("All recored with Email "+Email+" has been deleted");
	}
	void DeleteBySalary()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Enter Salary : ");
		int Salary = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getSalary() == Salary)
			{
				for(int j = i; j<CurrentEmployeeCount-1;j++)
				{
					employee[j] = employee[j+1];
				}
				i--;
				CurrentEmployeeCount--;
			}
		}
		System.out.println("All recored with Salary "+Salary+" has been deleted");
	}
	void DeleteByAddress()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Enter Address : ");
		String Address = sc.nextLine();
		sc.nextLine();
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getAddress().equals(Address))
			{
				for(int j = i; j<CurrentEmployeeCount-1;j++)
				{
					employee[j] = employee[j+1];
				}
				i--;
				CurrentEmployeeCount--;
			}
		}
		System.out.println("All recored with Address "+Address+" has been deleted");
	}
	void updateEmployeeDetailsByID()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("What is employee UID : ");
		int ID = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getID() == ID)
			{
				System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
				System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getEmail()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getAddress());

				System.out.print("Update Name : ");
				String Name = sc.nextLine();
				employee[i].setName(Name);
		
				System.out.print("Update Email : ");
				String Email = sc.nextLine();
				employee[i] .setEmail(Email);

				System.out.print("Update Salary : ");
				int Salary = sc.nextInt();
				sc.nextLine();
				employee[i].setSalary(Salary);	
				
				System.out.print("Update Address : ");
				String Address = sc.nextLine();
				employee[i].setAddress(Address);

				System.out.println("Data of the employee UID "+ID+" had been updated successfully");
			}
		}
	}
	void updateEmployeeDetailsByName()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("What is employee Name : ");
		String NameDemo = sc.nextLine();
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getName().equals(NameDemo))
			{
				System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
				System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getEmail()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getAddress());

				System.out.print("Update Name : ");
				String Name = sc.nextLine();
				employee[i].setName(Name);
		
				System.out.print("Update Email : ");
				String Email = sc.nextLine();
				employee[i] .setEmail(Email);

				System.out.print("Update Salary : ");
				int Salary = sc.nextInt();
				sc.nextLine();
				employee[i].setSalary(Salary);	
				
				System.out.print("Update Address : ");
				String Address = sc.nextLine();
				employee[i].setAddress(Address);

				System.out.println("Data of the employee Name "+Name+" had been updated successfully");
			}
		}
	}
	void updateEmployeeDetailsByEmail()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("What is employee Email : ");
		String EmailDemo = sc.nextLine();
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getEmail().equals(EmailDemo))
			{
				System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
				System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getEmail()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getAddress());

				System.out.print("Update Name : ");
				String Name = sc.nextLine();
				employee[i].setName(Name);
		
				System.out.print("Update Email : ");
				String Email = sc.nextLine();
				employee[i] .setEmail(Email);

				System.out.print("Update Salary : ");
				int Salary = sc.nextInt();
				sc.nextLine();
				employee[i].setSalary(Salary);	
				
				System.out.print("Update Address : ");
				String Address = sc.nextLine();
				employee[i].setAddress(Address);

				System.out.println("Data of the employee Email "+Email+" had been updated successfully");
			}
		}
	}
	
	void updateEmployeeDetailsByAddress()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("What is employee Address : ");
		String AddressDemo = sc.nextLine();
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getAddress().equals(AddressDemo))
			{
				System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
				System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getEmail()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getAddress());

				System.out.print("Update Name : ");
				String Name = sc.nextLine();
				employee[i].setName(Name);
		
				System.out.print("Update Email : ");
				String Email = sc.nextLine();
				employee[i] .setEmail(Email);

				System.out.print("Update Salary : ");
				int Salary = sc.nextInt();
				sc.nextLine();
				employee[i].setSalary(Salary);	
				
				System.out.print("Update Address : ");
				String Address = sc.nextLine();
				employee[i].setAddress(Address);

				System.out.println("Data of the employee Address "+Address+" had been updated successfully");
			}
		}
	}
	void updateEmployeeDetailsBySalary()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("What is employee Salary : ");
		int SalaryDemo = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(employee[i].getSalary() == SalaryDemo)
			{
				System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
				System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getEmail()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getAddress());

				System.out.print("Update Name : ");
				String Name = sc.nextLine();
				employee[i].setName(Name);
		
				System.out.print("Update Email : ");
				String Email = sc.nextLine();
				employee[i] .setEmail(Email);

				System.out.print("Update Salary : ");
				int Salary = sc.nextInt();
				sc.nextLine();
				employee[i].setSalary(Salary);	
				
				System.out.print("Update Address : ");
				String Address = sc.nextLine();
				employee[i].setAddress(Address);

				System.out.println("Data of the employee Salary "+Salary+" had been updated successfully");
			}
		}
	}
	void sortByID()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		Employee tempEmployee[] = new Employee[CurrentEmployeeCount];
		
		// I dont want to make changes in my actual data so i am creating separate temp arrary of an object and copying data
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			tempEmployee[i] = employee[i];
		}

		System.out.println("1. Ascending oder\n2. Descending order");
		System.out.print("Make Choice :");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
		switch(choice)
		{
			case 1:
				for(int i = 0; i<CurrentEmployeeCount - 1; i++)
				{
					for(int j = i+1; j<CurrentEmployeeCount; j++)
					{
						if(tempEmployee[i].getID()>tempEmployee[j].getID())
						{
							Employee temp = tempEmployee[j];
							tempEmployee[j] = tempEmployee[i];
							tempEmployee[i] = temp;
						}
					}
				}
				break;
			case 2:
				for(int i = 0; i<CurrentEmployeeCount - 1; i++)
				{
					for(int j = i+1; j<CurrentEmployeeCount; j++)
					{
						if(tempEmployee[i].getID()<tempEmployee[j].getID())
						{
							Employee temp = tempEmployee[j];
							tempEmployee[j] = tempEmployee[i];
							tempEmployee[i] = temp;
						}
					}
				}
				break;
			default:
				System.out.println("Invalit Input");
		}
		for(Employee e: tempEmployee)
		{
			System.out.println(e.getID()+"\t\t"+e.getName()+"\t\t"+e.getEmail()+"\t\t"+e.getSalary()+"\t\t"+e.getAddress());
		}
	}
	void sortBySalary()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		Employee tempEmployee[] = new Employee[CurrentEmployeeCount];
		
		// I dont want to make changes in my actual data so i am creating separate temp arrary of an object and copying data
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			tempEmployee[i] = employee[i];
		}

		System.out.println("1. Ascending oder\n2. Descending order");
		System.out.print("Make Choice :");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
		switch(choice)
		{
			case 1:
				for(int i = 0; i<CurrentEmployeeCount - 1; i++)
				{
					for(int j = i+1; j<CurrentEmployeeCount; j++)
					{
						if(tempEmployee[i].getSalary()>tempEmployee[j].getSalary())
						{
							Employee temp = tempEmployee[j];
							tempEmployee[j] = tempEmployee[i];
							tempEmployee[i] = temp;
						}
					}
				}
				break;
			case 2:
				for(int i = 0; i<CurrentEmployeeCount - 1; i++)
				{
					for(int j = i+1; j<CurrentEmployeeCount; j++)
					{
						if(tempEmployee[i].getSalary()<tempEmployee[j].getSalary())
						{
							Employee temp = tempEmployee[j];
							tempEmployee[j] = tempEmployee[i];
							tempEmployee[i] = temp;
						}
					}
				}
				break;
			default:
				System.out.println("Invalit Input");
		}
		for(Employee e: tempEmployee)
		{
			System.out.println(e.getID()+"\t\t"+e.getName()+"\t\t"+e.getEmail()+"\t\t"+e.getSalary()+"\t\t"+e.getAddress());
		}
	}
	void showSpecificRangeSalary()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Minimum Salary : ");
		int min = sc.nextInt();
		sc.nextLine();
		System.out.print("Maximum Salary : ");
		int max = sc.nextInt();
		sc.nextLine();
		System.out.println("UID\t\tName\t\tEmail\t\t\tSalary\t\tAddress");
		for(int i = 0; i<CurrentEmployeeCount; i++)
		{
			if(min <= employee[i].getSalary() && employee[i].getSalary() <= max)
			{
				System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getEmail()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getAddress());
			}
		}
	}
}