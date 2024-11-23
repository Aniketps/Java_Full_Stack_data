// 10. Count number of digits in number


import java.util.*;
public class CountNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter num : ");
		n = sc.nextInt();
		int count = 0;
		while(n!=0)
		{
			count++;
			n = n/10;
		}
		System.out.println("Count is "+ count);
	}
}