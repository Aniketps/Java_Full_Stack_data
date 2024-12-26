// 3. Student Grade Evaluation
// Task:
// Create a Student class with fields: name, marks, and subject.
// In the main method:
// Create a Student object.
// Check if the student has passed or failed the subject (passing marks >= 40) and print the result.
// Explanation:
// This task involves condition checking and field manipulation.

import java.util.*;
public class GradeCalculation
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		verifyPassStatus verifypassptatus = new verifyPassStatus();
		
		System.out.print("What is name: ");
		String Name = sc.next();
		verifypassptatus.setName(Name);
		
		System.out.print("What are marks: ");
		int Marks = sc.nextInt();
		verifypassptatus.setMarks(Marks);

		System.out.print("What is Subject name: ");
		String Subject = sc.next();
		verifypassptatus.setSubject(Subject);		
		
		String  result = verifyPassStatus.getData()? "passed": "failed";
		String StudentName = verifypassptatus.getName();
		String SubjectName = verifypassptatus.getSubject();
		System.out.println(StudentName+" "+result+" in subject "+SubjectName);
		
	}
}
class verifyPassStatus
{
	private String Name;
	static private int Marks;
	private String Subject;
	
	void setName(String name)
	{
		Name = name;
	}
	public String getName()
	{
		return Name;
	}

	void setMarks(int Marks)
	{
		this.Marks= Marks;
	}	
	public int getMarks()
	{
		return Marks;
	}
	
	void setSubject(String Subject)
	{
		this.Subject= Subject;
	}	
	public String getSubject()
	{
		return Subject;
	}

	static public boolean getData()
	{
		if(Marks >=40)
		{
			return true;
		}
		return false;
	}
}