// Write a java Program to input two angles from user and find third angle of the 
// triangle. How to find all angles of a triangle if two angles are given by user 
// using java programming. java program to calculate the third angle of a triangle if 
// two angles are given.

import java.util.*;
public class FindThirdAngle
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a1, a2, a3;		
		System.out.print("Enter two angles: ");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		if((a1 > 0) && (a2 > 0)){
			a3 = 180 - (a1 + a2);
			System.out.println("The third angle is "+ a3);
		}
		else
		{
			System.out.println("Enter valid data");
		}
	}
}