// Write a Java program to input sides of a triangle and check whether a triangle is 
// equilateral, scalene or isosceles triangle using if else. How to check whether a 
// triangle is equilateral, scalene or isosceles triangle in java programming. Logic to 
// classify triangles as equilateral, scalene or isosceles triangle if sides are given 
// in java program.

import java.util.*;
public class CheckTrangleType
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int s1, s2,s3;		
		System.out.print("Enter three sides : ");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();

		if((s1 == s2) && (s2 == s3))
		{
			System.out.println("The trangle is equilateral");
		}
		else if((s1 == s2) || (s2 == s3))
		{
			System.out.println("The trangle is isosceles");
		}
		else
		{
			System.out.println("The trangle is scalene");	
		}
	}
}