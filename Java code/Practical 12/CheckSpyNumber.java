//  Check Number Is Spy Number or Not.
//	 
//	 Example :
//	 A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits. 


import java.util.*;
public class CheckSpyNumber
{
	public  static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, product = 1, rem, sum = 0;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		while(num!=0)
		{
			rem = num%10;
			num = num/10;
			product *= rem;
			sum += rem;
		}
		System.out.println((product == sum) ? "Number is Spy" : "Number is not Spy");	
	}
}