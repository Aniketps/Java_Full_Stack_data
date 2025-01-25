// 2) WAP to enter the five elements in array and calculate the sum of all elements

import java.util.*;
public class ArrayTest02
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int arr[] = new int[5];
		System.out.print("Enter 5 digits : ");
		for(int i = 0; i<5; i++)
		{
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("The sum is "+sum);
	}
}