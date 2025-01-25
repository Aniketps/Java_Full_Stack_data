// 1. Write a java program to check whether number is prime or not, if it is prime then return true otherwise return false.

import java.util.*;

class CheckPrime
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(checkPrice(num))
		{
			System.out.println("The number "+num+" is Prime");
		}
		else
		{
			System.out.println("The number "+num+" is not Prime");	
		}
	}
	public static boolean checkPrice(int num)
	{
		for(int i = num-1; i>1; i--)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}