import java.util.*;

class Employee
{
	Scanner sc = new Scanner(System.in);
	int MaxWorkH;
	Employee()
	{
		MaxWorkH = 400*4;		
	}

	private int ID;
	private String Name;
	private int TotalWorkH;
	private int Salary;
	private int OverTimeH;

	void setID(int ID)
	{
		this.ID = ID;
	}
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setTotalWorkH(int TotalWorkH)
	{
		this.TotalWorkH = TotalWorkH;
	}
	void setSalary(int Salary)
	{
		if(TotalWorkH == 0)
		{
			System.out.println("Set total worked hrs first");
			return;
		}
		this.Salary = Salary + (50 * getOverTimeH());
	}
	void setOverTimeH()
	{
		if(getTotalWorkH() > MaxWorkH)
		{
			OverTimeH = getTotalWorkH() - MaxWorkH;
			return;
		}
		OverTimeH = 0;
	}
	
	// ID, Name, total working, salary, overtime
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	int getTotalWorkH()
	{
		return TotalWorkH;
	}
	int getSalary()
	{
		return Salary;
	}
	int getOverTimeH()
	{
		return OverTimeH;
	}
}