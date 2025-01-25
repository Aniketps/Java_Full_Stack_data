// 2. Student Marks Management
// Create a Student class with the following requirements:
// Define a constructor that takes the studentName, rollNumber, and 5 subject marks.
// Calculate the total marks and average marks for the student.
// Display the student’s name, roll number, total marks, and average marks.

import java.util.*;

class Student
{
	private int RollNo;
	private String Name;
	private int s1;
	private int s2;
	private int s3;
	private int s4;
	private int s5;

	int totalMarks = 0;
	
	Scanner sc = new Scanner(System.in);
	
	Student()
	{
		System.out.print("Roll no : ");
		RollNo = sc.nextInt();
		sc.nextLine();
		System.out.print("Name : ");
		Name = sc.nextLine();
		System.out.print("Subject 1 : ");
		s1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Subject 2 : ");
		s2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Subject 3 : ");
		s3 = sc.nextInt();
		sc.nextLine();
		System.out.print("Subject 4 : ");
		s4 = sc.nextInt();
		sc.nextLine();
		System.out.print("Subject 5 : ");
		s5 = sc.nextInt();
		sc.nextLine();
	}
	void getmarks()
	{
		totalMarks = s1 + s2 + s3 + s4 + s5;
		System.out.println("Total marks are : "+totalMarks);
 	}
	void getPerc()
	{
		totalMarks = s1 + s2 + s3 + s4 + s5;
		System.out.println("Percentage is : "+(float) totalMarks/5+"%");
	}
}

class CalMarkPerc
{
	public static void main(String ...x)
	{
		Student student = new Student();
		student.getmarks();
		student.getPerc();
	}
}