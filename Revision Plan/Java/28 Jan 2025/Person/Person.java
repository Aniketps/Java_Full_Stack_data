/*

4. Write program to Create class name as PersonalInfo with parameterized constructor PersonalInfo(String name, String middlename, String lastname) and you have to create class name as ProfessionalInfo with parameterized constructor like as ProfessionalInfo(int id,String des,int salary,String skillset) and you have to inherit PersonalInfo class in ProfessionalInfo and pass parameter from ProfessionalInfo class to PersonalInfo using super() constructor and you have to define void show() method in ProfessionalInfo and you have to show the all data in show() method.

*/
import java.util.*;

class PersonalInfo
{
	protected String Name;
	protected String middleName;
	protected String lastName;

	PersonalInfo(String Name, String middleName, String lastName)
	{
		this.Name = Name;
		this.middleName = middleName;
		this.lastName  = lastName;
	}
}

class ProfessionalInfo extends PersonalInfo
{
	protected int ID;
	protected String des;
	protected int Salary;
	protected String Skillset;

	ProfessionalInfo(int id,String des,int salary,String skillset)
	{
		super("Aniket", "Prakash", "Pardeshi");
		ID = id;
		this.des = des;
		Salary = salary;
		Skillset = skillset;
	}
	void show()
	{
		System.out.println("Name : "+Name+" "+middleName+" "+lastName);
		System.out.println("ID : "+ID);
		System.out.println("Designation : "+des);
		System.out.println("Salary : "+Salary);
		System.out.println("Skill set  : "+Skillset);
	}
}

class Person
{
	public static void main(String ...a)
	{
		ProfessionalInfo professionalInfo = new ProfessionalInfo(1, "Pune", 52000, "Java");
		professionalInfo.show();
	}
}