// Write a java program and compute the sum of an integers digits 

import java.util.*;

public class IntSum
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int num, DigitSum;
		System.out.print("Enter number : ");
		num = Ani.nextInt();
		DigitSum = (num%10) + (num/10)%10 + num/100;
		System.out.println("The sum of number is : " + DigitSum);
	}
}