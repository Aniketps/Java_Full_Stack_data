// 2) WAP to enter the five elements in array and find out the maximum and minimum elements

import java.util.*;
public class ArrayTest03
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int max, min;
		int arr[] = new int[5];
		System.out.print("Enter 5 digits : ");
		for(int i = 0; i<5; i++)
		{
			arr[i] = sc.nextInt();
		}
		max = arr[0];
		min = arr[0];
		for(int j = 0; j<5; j++)
		{
			if(min>arr[j])
			{
				min = arr[j];
			}
			if(max<arr[j])
			{
				max = arr[j];
			}
		}
		System.out.println("The max element is "+max+" and min element is "+min);
	}
}