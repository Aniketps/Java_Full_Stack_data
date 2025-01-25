// Q24. Write a java program to input binary number from user and find ones complement of binary number using loop. How to find 1s complement of a binary number in java programming. Logic to find ones complement of binary number in java programming.

import java.util.*;
public class L1P24
{
	public static void main(String ...x)	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binanry number(ex.101010): ");
		String num = sc.nextLine();
		int arr[] = new int[num.length()];
		for(int i = 0; i<num.length(); i++)
		{
			if(num.charAt(i) == '0')
			{
				arr[i] = 1;
			}
			else
			{
				arr[i] = 0;
			}
		}
		for(int n: arr)
		{
			System.out.print(n);
		}
	}
}