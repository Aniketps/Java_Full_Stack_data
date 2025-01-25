// Write a java program to check whether a triangle is valid or not if angles are 
// given using if else. How to check whether a triangle can be formed or not, if its 
// angles are given using if else in java programming. Logic to check triangle 
// validity if angles are given in java program. 

import java.util.*;
public class IsTrangleValid
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a1, a2,a3;		
		System.out.print("Enter three angles : ");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		a3 = sc.nextInt();

		if(((a1 + a2 + a3) == 180) && ((a1>0) &&(a2>0) &&(a3>0)))
		{
			System.out.println("The trangle is valid");
		}
		else
		{
			System.out.println("The trangle is not valid");	
		}
	}
}