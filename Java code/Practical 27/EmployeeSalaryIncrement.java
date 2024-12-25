// 1. Employee Salary Increment
// Task:
// Create an Employee class with fields: name, salary, and department.
// In the main method:
// Create an Employee object.
// Increase the employee's salary by 10% and print the updated salary.
// Explanation:
// This introduces instance variable manipulation and basic arithmetic operations.t

import java.util.*;
public class EmployeeSalaryIncrement
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		Company company = new Company();
		Employee employee = new Employee();
		
		System.out.print("What is Employee name: ");
		String Name = sc.next().nextLine();
		employee.setID(Name);
		
		System.out.print("What is Employee Salary: ");
		int Salary = sc.nextInt();
		employee.setSalary(Salary);		

		System.out.print("What is Employee deratment: ");
		String Department = sc.next().nextLine();
		employee.setDepartment(Department);

		company.setEmployee(employee);
		company.getEmployee(employee);
		
	}
}

class Company{
	private Employee employee;
	
	void setEmployee(Employee employee)
	{
		employee = employee;
	}
	void getEmployee(Employee employee)
	{
		System.out.println("Employee ID is : "+employee.getID());
		System.out.println("Employee Name is : "+employee.getName());
		System.out.println("Employee Age is : "+employee.getDepartment());
	}
}

class Person
{
	private String Name;
	private int Salary;
	private String Department;
	
	void setName(String name)
	{
		Name = name;
	}
	public String getName()
	{
		return Name;
	}

	void setSalary(int Salary)
	{
		Salary = Salary;
	}
	public int getSalary()
	{
		Salary = Salary + ((Salary*10)/100);
		return Salary;
	}

	void setDepartment(String Department)
	{
		Department = Department;
	}
	public String getDepartment()
	{
		return Department;
	}
}