/*

3. Move all zeros to the end of the array
Rearrange the array such that all zeros are moved to the end without changing the order of non-zero elements.
 Example:
Input: [0, 1, 9, 0, 5, 3, 0, 7] Output: [1, 9, 5, 3, 7, 0, 0, 0]

*/
import java.util.*;

class Move
{
	public static void main(String ...a)
	{
		int arr[] = {0,1,9,0,5,3,0,7};
		int size = arr.length;
		int count = 0;
		for(int i = 0; i<size; i++)
		{
			if(arr[i] == 0)
			{
				count++;
			}
		}
		for(int i = 0; i<size; i++)
		{
			if(arr[i] == 0)
			{
				for(int j = i; j<size-1; j++)
				{
					arr[j] = arr[j+1];
				}
				i--;
			}
		}
		for(int i = 0; i<size - count; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i = 0; i<count; i++)
		{
			System.out.print(0+" ");
		}
	}
}