// Write a program in java to find the Floor and Ceil of the number 0 to 10 from a sorted array.
// Expected Output :
// The given array is : 1 3 5 7 8 9
// Number: 0 ceiling is: 1 floor is: -1
// Number: 1 ceiling is: 1 floor is: 1
// Number: 2 ceiling is: 3 floor is: 1
// Number: 3 ceiling is: 3 floor is: 3
// Number: 4 ceiling is: 5 floor is: 3
// Number: 5 ceiling is: 5 floor is: 5
// Number: 6 ceiling is: 7 floor is: 5
// Number: 7 ceiling is: 7 floor is: 7
// Number: 8 ceiling is: 8 floor is: 8
// Number: 9 ceiling is: 9 floor is: 9
// Number: 10 ceiling is: -1 floor is: 9

import java.util.*;
public class FindCeilingAndFloorArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is size but must be below 10: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter element between 0 to 10 : ");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<size-1; i++)
		{
			for(int j = i+1; j<size; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	
		for(int i = 0; i<10; i++)
		{
			int floor = -1;
			int ceiling = -1;
			for (int j = 0; j < arr.length; j++) 
			{
    				if (arr[j] <= i) 
				{
        				floor = arr[j];
    				}
				if (arr[j] >= i && ceiling == -1) 
				{
        				ceiling = arr[j];
    				}
			}
			System.out.print("Number: "+i+" ceiling is: "+ceiling +" floor is: "+floor+"\n");
		}
	}
}