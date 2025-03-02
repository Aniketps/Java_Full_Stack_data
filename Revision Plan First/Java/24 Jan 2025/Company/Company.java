/*

4. Create a Employee class with fields empId, empName, and salary. Write a parameterized constructor to initialize these fields and a method to display the details along with a salary increase if applicable.
Explanation: Focuses on using constructors to set employee attributes and implementing logic to apply conditions on salary.

*/
import java.util.*;

class Company
{
	public static void main(String ...a)
	{
		Employee employee[] = new Employee[2];
		employee[0] = new Employee(1, "Aniket Pardeshi", 52000);
		employee[1] = new Employee(2, "Kishor Kumar", 50000);

		System.out.println("ID\tName\t\t\t\tSalary");
		for(Employee e : employee)
		{
			System.out.println(e.getID()+"\t"+e.getName()+"\t\t\t"+e.getSalary());
		}
	}
}