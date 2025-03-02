/*

2. Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
 This introduces instance variable manipulation and basic arithmetic operations.

*/
import java.util.*;

class ManageEmployee
{
	public static void main(String ...a)
	{
		Employee employee = new Employee("Aniket Pardeshi", 50000, "Development");
		System.out.println("Name : "+employee.getName());
		System.out.println("Salary : "+employee.getSalary());
		System.out.println("Department : "+employee.getDepartment());
		// Increase by 10%
		employee.setSalary(employee.getSalary() + ((employee.getSalary() * 10)/100));
		System.out.println("After 10%");
		System.out.println("Name : "+employee.getName());
		System.out.println("Salary : "+employee.getSalary());
		System.out.println("Department : "+employee.getDepartment());
	}
}