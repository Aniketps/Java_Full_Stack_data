//  Check Number Is Strong Number or Not.
// Example :
// A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,


import java.util.*;
public class CheckStrongNumber
{
	public  static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, rem, finalTotal = 0;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int temp = num;
		while(num!=0)
		{
			int total = 1;
			rem = num%10;
			num = num/10;
			while(rem!=0)
			{
				total = total * rem;
				
				rem--;
			}
			finalTotal = finalTotal + total;
				
		}
		System.out.println((temp == finalTotal) ? "Number is strong" : "Number is not strong");	
	}
}