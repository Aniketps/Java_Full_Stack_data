import java.util.*;

class Employee
{
	private String Name;
	private int Salary;
	private String Department;

	Employee(String Name, int Salary, String Department)
	{
		setName(Name);
		setSalary(Salary);
		setDepartment(Department);
	}

	// Setters
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setSalary(int Salary)
	{
		this.Salary = Salary;
	}
	void setDepartment(String Department)
	{
		this.Department = Department;
	}

	// Getters
	String getName()
	{
		return Name;
	}
	int getSalary()
	{
		return Salary;
	}
	String getDepartment()
	{
		return Department;
	}
}