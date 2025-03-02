import java.util.*;

class Check
{
	private int Num;

	Check(int Num)
	{
		this.Num = Num;
	}
	void isPrime()
	{
		for(int i = Num-1; i>1; i--)
		{
			if(Num%i==0)
			{
				System.out.println("The number "+Num+" is not prime");
				return;
			}
		}
		System.out.println("The number "+Num+" is prime");
	}
}