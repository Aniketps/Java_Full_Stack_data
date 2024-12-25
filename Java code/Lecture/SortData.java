class Sort
{
	int arr[];

	void setSortData(int ...d)
	{
		arr = d;
	}

	void getSortData()
	{
		for(int i = 0; i<arr.length - 1; i++)
		{
			for(int j = i + 1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}

public class SortData
{
	public static void main(String ...x)
	{
		Sort obj = new Sort();
		obj.setSortData(10,20,30,40,50,60);
		obj.getSortData();
	}
}