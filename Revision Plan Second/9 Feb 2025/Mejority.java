/*

1. Find the majority element
Find the element that appears more than n/2 times in the array.
Example: [3, 3, 4, 2, 4, 4, 2, 4, 4]
The majority element is 4 because it appears 5 times, which is more than n/2 = 9/2 = 4.5.
Output: 4

*/
import java.util.*;

class Mejority
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Size : ");
		int size = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		boolean isFound = false;
		for(int i = 0; i<size; i++)
		{
			int count = 0;
			for(int j = i; j<size; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count > size/2)
			{
				System.out.println(arr[i]+" with count "+count);
				isFound = true;
				break;
			}
		}
		if(!isFound)
		{
			System.out.println("Cant find majority");
		}
	}
}