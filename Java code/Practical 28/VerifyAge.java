// 2. Person Age Verification
// Task:
// Create a Person class with fields: name and age.
// In the main method:
// Create a Person object.
// Check if the person is eligible to vote (age >= 18) and print the result.
// Explanation:
// This demonstrates condition checking using instance variables.

import java.util.*;
public class VerifyAge
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		verifyVoter verifyvoter = new verifyVoter();
		
		System.out.print("What is name: ");
		String Name = sc.next();
		verifyvoter.setName(Name);
		
		System.out.print("What is Age: ");
		int Age = sc.nextInt();
		verifyvoter.setAge(Age);		
		
		String  Permission = verifyvoter.getData()? "Can vote": "Cant vote";
		String PersonName = verifyvoter.getName();
		System.out.println(PersonName+" "+Permission+".");
		
	}
}
class verifyVoter
{
	private String Name;
	private int Age;
	
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
		this.Age= Age;
	}
	public boolean getData()
	{
		if(Age >=18)
		{
			return true;
		}
		return false;
	}
}