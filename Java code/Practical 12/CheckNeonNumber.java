//  Check Number Is Neon Number or Not.
// Example :
// A neon number is a number where the sum of digits of square of the number is equal to the number. 


import java.util.*;
public class CheckNeonNumber
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