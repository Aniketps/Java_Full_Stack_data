// Write a java program to input principle (amount), time and rate (P, T, R) and find 
// Compound Interest. How to calculate compound interest in java programming. 
// Logic to calculate compound interest in java program. 


import java.util.*;
public class CICal
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		double P, T, R;		
		System.out.print("Enter P, T and R values respectively: ");
		P = sc.nextDouble();
		T = sc.nextDouble();
		R = sc.nextDouble();

		double CI = P * Math.pow((1 + (R/100)), T);
		System.out.println(CI);
	}
}