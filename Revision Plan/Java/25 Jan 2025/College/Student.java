import java.util.*;

class Student
{
	private int Roll;
	private int Marks;

	Student()
	{
		Roll = 1;
		Marks = 75;
	}

	void displayDetails()
	{
		System.out.println("Details");
		System.out.println("Roll no. : "+Roll);
		System.out.println("Marks : "+Marks);
	}
}