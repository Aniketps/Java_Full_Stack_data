/*

3. Prime Number Checker
Create a Number class with a field num. Use a parameterized constructor to initialize it. Add a method to check if the number is prime.
Explanation: Use efficient prime-checking logic with a clear object-based implementation.

*/
import java.util.*;

class NumCheck
{
	public static void main(String ...a)
	{
		Check check = new Check(7);
		check.isPrime();
		check = new Check(10);
		check.isPrime();
	}
}