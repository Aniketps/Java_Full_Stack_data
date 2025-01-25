import java.util.*;

class Book
{
	private int ID;
	private String Name;
	private String Author;
	private String Subject;
	private String IsBn;
	private boolean Status;
	
	public Book(){}

	public Book(int ID, String Name, String Author, String Subject, String IsBn, boolean Status)
	{
		setID(ID);
		setName(Name);
		setAuthor(Author);
		setSubject(Subject);
		setIsBn(IsBn);
		setStatus(Status);
	}

	// Setter for all
	void setID(int ID)
	{
		this.ID = ID;
	}
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setSubject(String Subject)
	{
		this.Subject = Subject;
	}
	void setAuthor(String Author)
	{
		this.Author = Author;
	}
	void setIsBn(String IsBn)
	{
		this.IsBn = IsBn;
	}
	void setStatus(boolean Status)
	{
		this.Status = Status;
	}

	// Getter for all
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	String getAuthor()
	{
		return Author;
	}
	String getSubject()
	{
		return Subject;
	}
	String getIsBn()
	{
		return IsBn;
	}
	boolean getStatus()
	{
		return Status;
	}
}