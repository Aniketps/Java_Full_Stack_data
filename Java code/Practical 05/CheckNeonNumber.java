// Write a java program to check whether the number is Neon or not
// Input : 9 
// Square of : 9 * 9 = 81 
// 8 + 1 = 9

import java.util.*;
public class CheckNeonNumber
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int num, square, sum = 0;
		System.out.print("Enter number : ");
		num = Ani.nextInt();
		square = num * num; // 123
		// sum = square%10 + (square/10)%10 + square/100;
		while(square >= 10)
		{
		 	sum = sum + square%10;
			square = square/10;
		}
		sum = sum + square;
		if(sum == num)
		{
			System.out.println("The number is neon");
		}
		else
		{
			System.out.println("The number is not neon");
		}
	}
}