// Q 7. Write a java program to find all factors of a number.

import java.util.*;
public class FindTheFactorsNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int startPoint = 1;
		while(startPoint!=num)
		{
			if((num%startPoint)==0){
				System.out.println(startPoint);
			}
			startPoint++;
		}
	}
}