// Check Number Is Perfect Number or Not.
// Example :
// perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect // number is 6, 
// which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128. 


import java.util.*;
public class CheckPerfectNumber
{
	public  static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, total = 0;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int Start = 1;
		while(Start!=num)
		{
			if((num%Start)==0)
			{
				total = total + Start;
			}
			Start++;
		}
		if(total == num)
		{
			System.out.println(num + " is perfect number");
		}
		else
		{
			System.out.println(num + " is not perfect number");
		}
	}
}