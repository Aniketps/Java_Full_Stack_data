// Q2. Write a java program to check whether number is Armstrong or not.

import java.util.*;

class CheckArmStrongNum
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		while(temp>0)
		{
			count++;
			temp = temp/10;
		}
		temp = num;
		int total = 0;
		while(temp>0)
		{
			int div = temp%10;
			total = total + (int) Math.pow(div, count);
			temp = temp/10;
		}
		if(num == total)
		{
			System.out.println("The number is ArmStrong");
		}
		else
		{
			System.out.println("The number is not ArmStrong");
		}
	}
}