import java.util.*;
public class Courses
{
	int ID;
	String Name;
	String Duration;
	int Fees;
	
	// Set Data for course
	void setFees(int Fees)
	{
		this.Fees = Fees;
	}
	void setID(int ID)
	{
		this.ID = ID;
	}
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setDuration(String Duration)
	{
		this.Duration = Duration;
	}

	// Get Data of Course
	int getFees()
	{
		return Fees;
	}
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	String getDuration()
	{
		return Duration;
	}
}