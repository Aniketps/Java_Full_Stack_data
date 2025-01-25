class Search
{
	int arr[];

	void setSearchData(int ...d)
	{
		arr = d;
	}

	boolean getSearchData(int data)
	{
		for(int i = 0; i<arr.length; i++)
		{
			if(data == arr[i])
			{
				return i;
			}
		}
		return -1;
	}
}

public class SearchElement
{
	public static void main(String ...x)
	{
		Search obj = new Search();
		obj.setSearchData(10,20,30,40,50,60);
		int result = obj.getSearchData(90);
		if(result == -1)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println("Found at index "+result);
		}
	}
}