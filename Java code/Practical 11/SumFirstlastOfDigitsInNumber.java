// Q 9. Write a java program to find sum of first and last digit of a number.

import java.util.*;
public class SumFirstlastOfDigitsInNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, rem , rev = 0;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int first = 0;
		int last = num%10;
		while(num!=0)  // 123
		{
			rem = num%10;
			rev = (rev  * 10) + rem;
			if(num==num){
				first = rem;
			}
			num = num/10;
		}
		int sum = first + last;
		System.out.println("The Sum of digits is "+ sum);
	}
}