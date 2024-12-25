// Q4. WAP to create class name as Person with field id,name,age and address and input data and display it

import java.util.*;
public class LivingCategory
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		Human human = new Human();
		Person person = new Person();
		
		System.out.print("What is person id: ");
		int id = sc.nextInt();
		person.setID(id);
		
		System.out.print("What is person name: ");
		String Name = sc.next();
		person.setName(Name);		

		System.out.print("What is person age: ");
		int Age = sc.nextInt();
		person.setAge(Age);

		System.out.print("What is person address: ");
		String Address = sc.next();
		person.setAddress(Address);

		human.setPerson(person);
		human.getPerson(person);
		
	}
}

class Human{
	private Person person;
	
	void setPerson(Person person)
	{
		person = person;
	}
	void getPerson(Person person)
	{
		System.out.println("Person ID is : "+person.getID());
		System.out.println("Person Name is : "+person.getName());
		System.out.println("Person Age is : "+person.getAge());
		System.out.println("Person Address is : "+person.getAddress());
	}
}

class Person
{
	private int ID;
	private String Name;
	private int Age;
	private String Address;

	void setID(int id)
	{
		ID = id;
	}
	public int getID()
	{
		return ID;
	}
	
	void setName(String name)
	{
		Name = name;
	}
	public String getName()
	{
		return Name;
	}

	void setAge(int Age)
	{
		Age = Age;
	}
	public int getAge()
	{
		return Age;
	}

	void setAddress(String Address)
	{
		Address = Address;
	}
	public String getAddress()
	{
		return Address;
	}
}