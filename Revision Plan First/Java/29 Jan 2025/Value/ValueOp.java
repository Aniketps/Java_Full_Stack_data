/*

2. Write Program to create abstract class name as Value with one abstract and one non abstract method
void setValue(int ,int): this is non abstract method with two parameter abstract int getResult(): this is abstract method and you have two child class name as Power and you have to override getResult() method in Power class and calculate power of two values and return it as well as SearchDigit and you have to override getResult() consider first parameter of setValue() is number and second parameter is digit and you have to search digit in number and return it and if digit not found return -1.

*/

import java.util.*;

abstract class Value
{
	protected int a;
	protected int b;
	void setValue(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	abstract int getResult();
}

class Power extends Value
{
	int getResult()
	{
		int powerIs = 1;
		for(int i = 0; i<b; i++)
		{
			powerIs = powerIs * a;
		}
		return powerIs;
	}
}

class Search extends Value
{
	int getResult()
	{
		boolean isFound = false;
		String searchData = Integer.toString(a);
		String data = Integer.toString(b);

		if(data.contains(searchData))
		{
			return Integer.parseInt(searchData);
		}
		else
		{
			return -1;
		}
	}
}

class ValueOp
{
	public static void main(String ...a)
	{
		Value v = new Power();
		v.setValue(10, 2);
		System.out.println("2nd Power of 10 is "+v.getResult());

		v = new Search();
		v.setValue(10, 1251012);
		System.out.println(v.getResult());

		v = new Search();
		v.setValue(100, 1251012);
		System.out.println(v.getResult());
	}
}