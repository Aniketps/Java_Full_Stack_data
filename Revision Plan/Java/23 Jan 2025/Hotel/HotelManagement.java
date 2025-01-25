import java.util.*;

class HotelManagement
{
	Staff staff[] = new Staff[5];
	int CurrentStaffCount = 0;
	int MaxStaffCount = 5;
	
	Scanner sc = new Scanner(System.in);

	void addStaff()
	{
		if(CurrentStaffCount>=MaxStaffCount)
		{
			System.out.println("Max staff limit reached");
			return;
		}
		staff[CurrentStaffCount] = new Staff();
		staff[CurrentStaffCount].setID(CurrentStaffCount+1);

		System.out.print("Staff Name : ");
		staff[CurrentStaffCount].setName(sc.nextLine());

		System.out.print("Staff Role : ");
		staff[CurrentStaffCount].setRole(sc.nextLine());

		System.out.print("Salary : ");
		staff[CurrentStaffCount].setSalary(sc.nextInt());
		sc.nextLine();

		CurrentStaffCount++;

		System.out.println("Staff recruited successfully");
	}
	
	void showStaff()
	{
		System.out.println("ID\tName\t\t\t\tRole\t\t\tSalary");
		for(Staff s: staff)
		{
			if(s == null){return;}
			System.out.println(s.getID()+"\t"+s.getName()+"\t\t\t"+s.getRole()+"\t\t\t"+s.getSalary());
		}
	}
}