//  Check Number Is Armstrong Number or Not.
// Example :
// A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself. 
// For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit 
// Armstrong numbers and there are many more.


import java.util.*;
public class CheckArmStrongNumber
{
	public  static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, count = 0, finalTotal = 0, rem;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int temp = num;
		int temp1 = num;
		while(temp1!=0)
		{
			count++;
			temp1 = temp1/10;
		}
		
		while(num!=0)
		{
			int Start = 0;
			int total = 1;
			rem = num%10;
			num = num/10;
			while(Start!=count)
			{
				total *= rem;
				Start++;
			}
			finalTotal = finalTotal + total;
		}
		System.out.println((temp == finalTotal) ? "Number is Armstrong" : "Number is not Armstrong");	
	}
}