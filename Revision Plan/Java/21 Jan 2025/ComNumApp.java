/*

2. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.

*/

class Compare
{
	void NumberComparison(int a, int b)
	{
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else if(a<b)
		{
			System.out.println(a+" is less than "+b);
		}
		else
		{
			System.out.println(a+" and "+b+" are same");
		}
	}
}

class ComNumApp
{
	public static void main(String ...a)
	{
		Compare compare = new Compare();
		compare.NumberComparison(10, 20);
		compare.NumberComparison(10, 2);
		compare.NumberComparison(12,12);
	}
}