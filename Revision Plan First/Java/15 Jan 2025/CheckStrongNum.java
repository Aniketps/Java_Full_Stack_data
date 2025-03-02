// Q1. Write a java program to check whether number is strong or not.

import java.util.*;

class CheckStrongNum
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int numCopy = num;
		int total = 0;
		while(numCopy>0)
		{
			int temp = 1;
			int div = numCopy%10;
			for(int j = div; j>0; j--)
			{
				temp = temp * j;
			}
			total = total + temp;
			numCopy = numCopy/10; 
		}
		if(total == num)
		{
			System.out.println("The number is Strong");
		}
		else
		{
			System.out.println("The number is not Strong");
		}
	}
}