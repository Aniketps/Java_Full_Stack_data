// Check Number Is Prime Number or Not.
	
// Example :
// A prime number is a number that can only be divided by itself and 1 without remainders. 
// The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.


import java.util.*;
public class CheckPrimeNum
{
	public  static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		if(num==2)
		{
			System.out.println(num + " is a prime number");
		}
		else
		{
			if(((num%2) == 0) && (num%1 == 0))
			{
				System.out.println(num + " is not prime number");
			}
			else
			{
				System.out.println(num + " is prime number");
			}
		}
	}
}