// Write a java program to input electricity unit charge and calculate the total 
// electricity bill according to the given condition: 
// For first 50 units Rs. 0.50/unit 
// For next 100 units Rs. 0.75/unit 
// For next 100 units Rs. 1.20/unit 
// For unit above 250 Rs. 1.50/unit 
// An additional surcharge of 20% is added to the bill. 
// How to calculate electricity bill using if else in java programming. Program to 
// find electricity bill using if else in java. Logic to find net electricity bill in java 
// program.

import java.util.*;
public class ElectriccityBillCal
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int units;
		double total;		
		System.out.print("Enter units: ");
		units = sc.nextInt();
		
		if(units <= 50){
			total = units * 0.5;
		}
		else if(units <= 150){
			total = (50 * 0.5) +  (units - 50) * 0.75;
		}
		else if(units >= 250){
			total = (50 * 0.5) + (100 * 0.75) + (units - 150) * 1.2;
		}
		else
		{
			total = (50 * 0.5) + (100 * 0.75) + (150 * 1.2) + (units -  250) * 1.5;
		}
		total += total * 0.20;
		System.out.println(total);
	}
}