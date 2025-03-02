/*

3. Write Program create class name as ArrSum with method void setValue(int arr[]) you have to create child class name as GetSum with method int getArrSum() you have to accept array values from ArrSum and calculate its sum and return it.

*/

import java.util.*;

class ArrSum
{
	protected int arr[];

	void setValue(int arr[])
	{
		this.arr = arr;
	}
}

class GetSum extends ArrSum
{
	void getArrSum()
	{
		int total = 0;
		for(int a: arr)
		{
			total += a;
		}
		System.out.println("The sum is : "+total);
	}
}

class ArrCal
{
	public static void main(String ...a)
	{
		GetSum getSum = new GetSum();
		getSum.setValue(new int[]{10,20,50,40,2,01,521,12,60,12,5,520,12});
		getSum.getArrSum();
	}
}