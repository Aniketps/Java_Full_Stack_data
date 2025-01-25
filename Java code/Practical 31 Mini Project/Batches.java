import java.util.*;
public class Batches
{
	// Date of the batches
	int ID;
	String StartDate;	
	String EndDate;
	String Name;
	
	// Set Batch Data
	void setID(int ID)
	{
		this.ID = ID;
	}
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setStartDate(String StartDate)
	{
		this.StartDate = StartDate;
	}
	void setEndDate(String EndDate)
	{
		this.EndDate = EndDate;
	}

	// Get Batch Data
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	String getStartDate()
	{
		return StartDate;
	}
	String getEndDate()
	{
		return EndDate;
	}
	
}