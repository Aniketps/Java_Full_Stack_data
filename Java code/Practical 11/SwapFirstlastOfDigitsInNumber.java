// Q 10. Write a java program to swap first and last digits of a number

import java.util.*;
public class SwapFirstlastOfDigitsInNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, rem, newNumber;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int original = num;
		int lenghtIs = 1;
		int first = 0;
		int last = num%10;
		while(num!=0)  // 123
		{
			rem = num%10;
			first = rem;
			num /= 10;
			lenghtIs *= 10;
		}
		newNumber = (last*(lenghtIs/10))+(((original%(lenghtIs/10))/10)*10)+first;
		System.out.println("new number" + newNumber);
		System.out.println("old number" + original);
		
	}
}