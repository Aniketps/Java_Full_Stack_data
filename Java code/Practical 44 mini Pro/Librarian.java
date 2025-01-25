import java.util.*;

class Librarian extends User
{
	private String Designation;
	
	public Librarian(){}
	
	public Librarian(int ID, String Name, String Email, String Contact, String UserType, String Designation)
	{
		setDesignation(Designation);
		setID(ID);
		setName(Name);
		setEmail(Email);
		setContact(Contact);
		setUserType(UserType);
	}

	// Remain Setter
	void setDesignation(String Designation)
	{
		this.Designation = Designation;
	}
	
	// Remain Getter
	String getDesignation()
	{
		return Designation;
	}
}