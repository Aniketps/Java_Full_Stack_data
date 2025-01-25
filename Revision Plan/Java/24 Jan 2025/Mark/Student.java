import java.util.*;

class Student
{
	private String Name;
	private int Roll;
	private int Marks;

	Student()
	{
		Name = "Hasti Chari";
		Roll = 25;
		Marks = 39;
	}
	
	// Getter
	int getMarks()
	{
		return Marks;
	}
	String getName()
	{
		return Name;
	}
}