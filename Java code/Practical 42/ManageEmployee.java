import java.util.*;

class ManageEmployee
{
	Scanner sc = new Scanner(System.in);
	Employee employee[] = new Employee[5];
	int currentEmployeeCount = 0;
	
	void setEmployee()
	{

		if(currentEmployeeCount>=5){ return; }

		employee[currentEmployeeCount] = new Employee();
		
		employee[currentEmployeeCount].setID(currentEmployeeCount+1);
		
		System.out.print("Name of Employee : ");
		employee[currentEmployeeCount].setName(sc.nextLine());
		
		System.out.print("Employee 1st week total worked hrs : ");
		int w1 = sc.nextInt();
		System.out.print("Employee 2nd week total worked hrs : ");
		int w2 = sc.nextInt();
		System.out.print("Employee 3rd week total worked hrs : ");
		int w3 = sc.nextInt();
		System.out.print("Employee 4th week total worked hrs : ");
		int w4 = sc.nextInt();
		employee[currentEmployeeCount].setTotalWorkH(w1+w2+w3+w4);
		sc.nextLine();

		employee[currentEmployeeCount].setOverTimeH();

		System.out.print("Employee Salary : ");
		employee[currentEmployeeCount].setSalary(sc.nextInt());
		sc.nextLine();

		currentEmployeeCount++;
	}
	void showEmployee()
	{
		System.out.println("ID\t\tName\t\tTotal week Hrs\tSalary\t\tOver time hrs");
		for(int i = 0; i<currentEmployeeCount; i++)
		{
			System.out.println(employee[i].getID()+"\t\t"+employee[i].getName()+"\t\t"+employee[i].getTotalWorkH()+"\t\t"+employee[i].getSalary()+"\t\t"+employee[i].getOverTimeH());
		}
	}
}