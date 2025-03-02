/*

3. Create a Student class with attributes name, rollNumber, and marks. Use a constructor to initialize the values and write a method to display whether the student has passed (marks > 40).
Explanation: This problem will help you implement logic within a constructor and a method based on conditions.

*/
import java.util.*;

class Mark
{
	public static void main(String a[])
	{
		Student student = new Student();
		if(student.getMarks() > 40)
		{
			System.out.println(student.getName()+" Passed the test");
		}
		else
		{
			System.out.println(student.getName()+" Failed the test");
		}
	}
}