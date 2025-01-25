import java.util.*;

class Staff
{
	private int ID;
	private String Name;
	private String Role;
	private int Salary;

	Staff(){}

	Staff(int ID, String Name, String Role, int Salary)
	{
		setID(ID);
		setName(Name);
		setRole(Role);
		setSalary(Salary);
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
	void setRole(String Role)
	{
		this.Role = Role;
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
	String getRole()
	{
		return Role;
	}
	int getSalary()
	{
		return Salary;
	}
}