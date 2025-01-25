// Q2. Write a java program to calculate the sum of 1 to nth strong number.

import java.util.*;

class NthStrong
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("End number : ");
		int n = sc.nextInt();

		for(int i = n; i>=1; i--)
		{
			int temp = i;
			int count = 0;
			while(temp>0)
			{
				int rem = temp%10;
				int mul = 1;
				for(int j = rem; j>0; j--)
				{
					mul = mul*j;
				}
				count = count + mul;
				temp = temp/10;
			}
			if(count == i)
			{
				System.out.println("Strong number is  : "+i);
			}
		}
	}
}