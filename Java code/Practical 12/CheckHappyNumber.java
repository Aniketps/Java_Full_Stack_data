//  Check Number Is Happy Number or Not.
//	
//	Example :
//	A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced 
//	by the sum of squares of its digit that is if we start with Happy Number and keep replacing it with digits 
//	square sum, we reach 1. 
//
//	Input: n = 19
//	Output: True
//	19 is Happy Number,
//	1^2 + 9^2 = 82
//	8^2 + 2^2 = 68
//	6^2 + 8^2 = 100
//	1^2 + 0^2 + 0^2 = 1
//	As we reached to 1, 19 is a Happy Number.


import java.util.*;
public class CheckHappyNumber
{
	public  static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, square, rem, total = 0;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		square  = num * num;
		while(square!=0)
		{
			rem = square%10;
			square = square/10;
			total += rem;
		}
		System.out.println((total == num) ? "Number is Neon" : "Number is not Neon");	
	}
}