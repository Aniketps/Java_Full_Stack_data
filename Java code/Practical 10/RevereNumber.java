// Write a java program to print all natural numbers in reverse (from n to 1).

import java.util.*;
public class RevereNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Lenght : ");
		n = sc.nextInt();
		while(n!=0)
		{
			System.out.println(n);
			n--;
		}
	}
}