/*

4. Find the majority element
Find the element that appears more than n/2 times in the array.
Example: [3, 3, 4, 2, 4, 4, 2, 4, 4]
The majority element is 4 because it appears 5 times, which is more than n/2 = 9/2 = 4.5.
Output: 4

*/
class FindMajor
{
	public static void main(String ...a)
	{
		int arr[] = {3,3,4,2,4,2,4,4,4};
		boolean isMajor = false;
		for(int i = 0; i<arr.length; i++)
		{
			int count = 0;
			for(int j = i; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count>(arr.length/2))
			{
				System.out.print(arr[i]+" is major found "+count+" times");
				isMajor = true;
				break;
			}
		}
		if(!isMajor)
		{
			System.out.println("There is no major found");
		}
	}
}