// Write a java program to input principle, time and rate (P, T, R) from user and find 
// Simple Interest. How to calculate simple interest in java programming. Logic to 
// find simple interest in java program.

import java.util.*;
public class SICal
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		float P, T, R;		
		System.out.print("Enter P, T and R values respectively: ");
		P = sc.nextFloat();
		T = sc.nextFloat();
		R = sc.nextFloat();

		float SI = (P*T*R)/100;
		System.out.println(SI);
	}
}