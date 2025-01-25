// 4. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

import java.util.*;

class Employee
{
	void work()
	{
		System.out.println("Employee is working");
	}
	void getSalary()
	{
		System.out.println("Salary");
	}
}

class HRManager extends Employee
{
	void work()
	{
		System.out.println("HR Manager is hiring");
	}
	void addEmployee()
	{
		System.out.println("New Employee recruited");
	}
}

class ManageEmployee
{
	public static void main(String ...x)
	{
		HRManager hrManager = new HRManager();
		hrManager.work();
		hrManager.addEmployee();
		hrManager.getSalary();
		
	}	
}