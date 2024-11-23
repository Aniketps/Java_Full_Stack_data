// Write a java program to find all roots of a quadratic equation using if else. How to 
// find all roots of a quadratic equation using if else in java programming. Logic to 
// find roots of quadratic equation in java programming.

import java.util.*;
public class FindTwoRoots
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c, d;		
		System.out.print("Enter a, b and c values: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		double root1, root2;
		d = b * b - 4 * a * c;
		if(d > 0){
			root1 = (-b + Math.sqrt(d)) / (2 * a);
        		root2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("Root 1 is "+root1+" Root 2 is" + root2);
		}
		else
		{
			root1 = root2 = -b / (2 * a);
			System.out.println("Root 1 is "+root1);
		}
	}
}