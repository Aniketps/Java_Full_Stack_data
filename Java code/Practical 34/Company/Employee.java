import java.util.*;
class Employee
{
	private int ID;
	private String Name;
	private String Email;
	private int Salary;
	private String Address;

	// Set data for employee
	void setID(int ID)
	{
		this.ID = ID;
	}
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setEmail(String Email)
	{
		this.Email = Email;
	}
	void setSalary(int Salary)
	{
		this.Salary = Salary;
	}
	void setAddress(String Address)
	{
		this.Address = Address;
	}

	// Get Employee data
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	String getEmail()
	{
		return Email;
	}
	int getSalary()
	{
		return Salary;
	}
	String getAddress()
	{
		return Address;
	}
}