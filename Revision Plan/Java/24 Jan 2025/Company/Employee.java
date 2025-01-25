import java.util.*;

class Employee
{
	private int ID;
	private String Name;
	private int Salary;

	Employee(){}

	Employee(int ID, String Name, int Salary)
	{
		setID(ID);
		setName(Name);
		// Increase Salary by 10%
		setSalary(((Salary*10)/100)+Salary);
	}
	
	// Setters
	void setID(int ID)
	{
		this.ID = ID;
	}
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setSalary(int Salary)
	{
		this.Salary = Salary;
	}

	// Getters
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	int getSalary()
	{
		return Salary;
	}
}