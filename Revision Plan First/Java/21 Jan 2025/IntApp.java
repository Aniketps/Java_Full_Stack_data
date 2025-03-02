/*

4. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.

*/

class SimpleInterest
{
	void interest(int p, float r, int t)
	{
		System.out.println("The Simple interest is "+((p*r*t)/100));
	}
}

class IntApp
{
	public static void main(String ...a)
	{
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.interest(10000, 0.05f, 1);
	}
}