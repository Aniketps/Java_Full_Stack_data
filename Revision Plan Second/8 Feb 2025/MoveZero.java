/*

3. Move all zeros to the end of the array
Rearrange the array such that all zeros are moved to the end without changing the order of non-zero elements.
 Example:
Input: [0, 1, 9, 0, 5, 3, 0, 7] Output: [1, 9, 5, 3, 7, 0, 0, 0]

*/
import java.util.*;

class MoveZero
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size : ");
		int size = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[size];
		for(int i = 0; i<size; i++)
		{
			System.out.print(i+1+" element : ");
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Zero moved");
		for(int i = 0; i<size;i++)
		{
			if(arr[i] == 0)
			{
				for(int j = i; j<size-1; j++)
				{
					arr[j] = arr[j+1];
				}
				arr[size-1] = 0;
				size--;
				i--;
			}
		}
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}