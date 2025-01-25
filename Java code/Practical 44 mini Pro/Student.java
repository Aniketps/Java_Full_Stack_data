import java.util.*;

class Student extends User
{
	String DepName;
	String Year;
	String Status;
	Book books[] = new Book[5];
	int MaxBookCount = 5;
	int CurrentBookCount = 0;
	
	public Student(){}
	
	public Student(int ID, String Name, String Email, String Contact, String UserType, String DepName, String Year)
	{
		setDepName(DepName);
		setYear(Year);
		setID(ID);
		setName(Name);
		setEmail(Email);
		setContact(Contact);
		setUserType(UserType);
		setStatus("Pending");
	}

	// Remain Setters
	void setDepName(String DepName)
	{
		this.DepName = DepName;
	}
	void setYear(String Year)
	{
		this.Year = Year;
	}
	void setStatus(String Status)
	{
		this.Status = Status;
	}
	void setBooks(Book book)
	{
		books[CurrentBookCount] = book;
		CurrentBookCount++;
	}

	// Remain Getters
	String getDepName()
	{
		return DepName;
	}
	String getYear()
	{
		return Year;
	}
	String getStatus()
	{
		return Status;
	}
	Book[] getBooks()
	{
		return books;
	}
}