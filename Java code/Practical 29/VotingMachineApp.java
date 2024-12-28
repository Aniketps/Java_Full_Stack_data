// Q2. WAP Voting application using method with variable argos concept
// Voter: id name and age mark as POJO class 
// VotingMachine: void acceptWord(Voter …v): accept the infinite voter if voter age is greater than 18 then display its data otherwise not
// VotingMachineApp: this method cantais voter details and pass to VotingMachine class

import java.util.*;
public class VotingMachineApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of voters available : ");
		int size = sc.nextInt();
		
		Voter voter[] = new Voter[size];

		for(int i = 0; i<size; i++)
		{
				voter[i] = new Voter();
				voter[i].setID(i+1);

				System.out.print(i+1+" Voter Name: \n");
				String voterName = sc.next();
				voter[i].setName(voterName);
		
				System.out.print(i+1+" Voter Age: ");
				int voterAge = sc.nextInt();
				voter[i].setAge(voterAge);
		}
		
		VotingMachine votingMachine = new VotingMachine();
		votingMachine.acceptVoter(voter);

		votingMachine.verifyVoter();
	}
}

class VotingMachine
{
	Voter voter[];

	void acceptVoter(Voter ...v)
	{
		voter = v;
	}

	void verifyVoter()
	{
		System.out.print("Acceptable voters \n");
		for(int i = 0; i<voter.length; i++)
		{
			if(voter[i].getAge()>=18)
			{
				System.out.print("ID : "+voter[i].getID()+", Name:  "+voter[i].getName()+", Age: "+voter[i].getAge()+"\n");
			}
		}
	}
}

class Voter
{
	// Store Voter data for manupulations id name and age
	int ID;
	String Name;
	int Age;

	// Setter methods for all variables
	void setID(int id)
	{
		ID = id;
	}
	void setName(String name)
	{
		Name = name;
	}
	void setAge(int age)
	{
		Age = age;
	}

	// Getter methods for all variables
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	int getAge()
	{
		return Age;
	}
}