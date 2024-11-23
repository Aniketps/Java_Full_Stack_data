// Write a java program to check whether the number is spy or not
// Input : 123
// sum of : 1 + 2 + 3 = 6
// product : 1 * 2 * 3 = 6

import java.util.*;
public class CheckSpyNumber
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int num, sum, pro;
		System.out.print("Enter number : ");
		num = Ani.nextInt();
		// int numcopy01 = num;
		// int numcopy02 = num;
		
		sum = num%10 + (num/10)%10 + num/100;
		pro = (num%10) * ((num/10)%10) * (num/100);
		
		// while(numcopy01 >= 10)
		// {
		//  	sum = sum + numcopy01%10;
		//	numcopy01 = numcopy01/10;
		// }
		// sum = sum+numcopy01;
		
		// while(numcopy02 >= 10)
		// {
		// 	pro = pro * numcopy02%10;
		//	numcopy02 = numcopy02/10;
		// }
		//pro =  pro * numcopy02;

		if(pro == sum)
		{
			System.out.println("The number is spy");
		}
		else
		{
			System.out.println("The number is not spy");
		}
	}
}