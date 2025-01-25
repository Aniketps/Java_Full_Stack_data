/*

3. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.

*/

class NumberChecker
{
	void isEven(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+" is even number");
		}
		else
		{
			System.out.println(num+" is odd number");
		}
	}
}

class checkNumApp
{
	public static void main(String ...a)
	{
		NumberChecker numberChecker = new NumberChecker();
		numberChecker.isEven(12);
		numberChecker.isEven(13);
	}
}