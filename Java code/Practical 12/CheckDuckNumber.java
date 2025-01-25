// Check Number Is Duck Number or Not.
// Example :
// A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers. 
// Please note that a numbers with only leading 0s is not considered as Duck Number. 
// For example, numbers like 035 or 0012 are not considered as Duck Numbers.


import java.util.*;
public class CheckDuckNumber
{
	public  static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, rem;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		boolean flag = false;
		while(num!=0)
		{
			rem = num%10;
			num = num/10;
			if(rem == 0)
			{
				flag = true;
			}
		}
		System.out.println(flag? "Number is duck" : "Number is not duck");
	}
}