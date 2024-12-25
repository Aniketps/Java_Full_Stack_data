// Q3. WAP to create class name as Perfect with two functions 
// void setValue(): this function can accept number as parameter 
// void checkPerfect(): this function can check number is perfect or not if perfect the show message number is perfect if not then show message number is not perfect

import java.util.*;

class Perfect
{
	int number;
	Scanner sc = new Scanner(System.in);
	void setValue()
	{
		System.out.print("Enter A number : ");
		number = sc.nextInt();
	}
		
	void checkPerfect()
	{
		int sum = 0;
		for(int i = number - 1; i>0; i--)
		{
			if(number%i == 0)
			{
				sum = sum +  i;
			}
		}
		if(sum == number)
		{
			System.out.print(number+" is perfect number");
		}
		else
		{
			System.out.print(number+" is not perfect number");
		}
	}
}

public class CheckPerfectNum
{
	public static void main(String ...x)
	{
		Perfect obj = new Perfect();
		obj.setValue();
		obj.checkPerfect();
	}
}