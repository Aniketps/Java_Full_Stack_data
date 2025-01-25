import java.util.*;

class User
{
	protected int ID;
	protected String Name;
	protected String Email;
	protected String Contact;
	protected String UserType;
	
	public User(){}

	public User(int ID, String Name, String Email, String Contact, String UserType)
	{
		setID(ID);
		setName(Name);
		setEmail(Email);
		setContact(Contact);
		setUserType(UserType);
	}

	// Common Setters
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
	void setContact(String Contact)
	{
		this.Contact= Contact;
	}
	void setUserType(String UserType)
	{
		this.UserType = UserType;
	}
	
	// Common Getters
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
	String getContact()
	{
		return Contact;
	}
	String getUserType()
	{
		return UserType;
	}
}