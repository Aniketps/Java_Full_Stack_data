// 9) . Write a program in C to separate odd and even integers in separate arrays ?
// Test Data :
// Input the number of elements to be stored in the array :5
// Input 5 elements in the array :
// element - 0 : 25
// element - 1 : 47
// element - 2 : 42
// element - 3 : 56
// element - 4 : 32
// Expected Output :
// The Even elements are :
// 42 56 32
// The Odd elements are :
// 25 47

import java.util.*;
public class SeparateEvenOddArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What size of array : ");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		System.out.print("\nEnter array "+size1+" elements: ");
		for(int i = 0; i<size1; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		int EvenArr[] = new int[size1];
		int EvenCount = 0;
		int OddArr[] = new int[size1];
		int OddCount = 0;
		for(int i = 0; i<size1; i++)
		{
			if(arr1[i]%2==0)
			{
				EvenArr[EvenCount] = arr1[i];
				EvenCount++;
			}else{
				OddArr[OddCount] = arr1[i];
				OddCount++;
			}
		}
		System.out.print("\nEven array : ");
		for(int i = 0; i<EvenCount; i++)
		{
			System.out.print(EvenArr[i]+" ");
		}
		System.out.print("\nOdd array : ");
		for(int i = 0; i<OddCount; i++)
		{
			System.out.print(OddArr[i]+" ");
		}
	}
}