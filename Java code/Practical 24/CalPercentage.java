// Q.3 WAP to Create a class name as StudentPer with function.

import java.util.*;
class StudentPer
{
	private int arr[];
	int total = 0;
	int result;

	void setStudentPer(int a[ ])
	{
		// this function can accept the integer array.
		arr = a;
	}

	void CalPer( ) 
	{
		//this function can use calculate the percentage in array.
		for(int i = 0; i<arr.length; i++)
		{
			total = total + arr[i];
		}
		result = total/arr.length;
	}

	void checkGrades()
	{
		//this function can use check the grade.
		if(result >= 90){
			System.out.println("Grade A");
		}else if(result < 90 && result >= 80 )
		{
 			System.out.println("Grade B");
		}else if(result < 80 && result >= 70)
		{
			System.out.println("Grade C");
		}else if(result < 70 && result >= 60)
		{
			System.out.println("Grade D");
		}else if (result < 60 && result >= 50)
		{
			System.out.println("Grade E");
		}else if(result < 50 && result >= 40)
		{
			System.out.println("Grade F");
		}else
		{
			System.out.print("Student is Fail.");
		}
	}
}

public class CalPercentage
{
	public static void main(String []x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Total Subjects: ");
		int Size1 = sc.nextInt();
		int arr1[] = new int[Size1];
		System.out.print("\nData for array : ");
		for(int i = 0; i<Size1; i++)
		{
			arr1[i] = sc.nextInt();
		}
		StudentPer obj = new StudentPer();
		obj.setStudentPer(arr1);
		obj.CalPer();
		obj.checkGrades();
	}
}