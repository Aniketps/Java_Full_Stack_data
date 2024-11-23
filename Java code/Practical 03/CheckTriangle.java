// Write a java program to check whether triangle is valid or not.

import java.util.*;
public class CheckTriangle
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int a1, a2, a3;
		System.out.print("Enter Angles : ");
		a1 = Ani.nextInt();
		a2 = Ani.nextInt();
		a3 = Ani.nextInt();
		String Data = (a1+a2+a3)==180 && a1>0 && a2>0 && a3>0 ? "The Triangle is Valid" : "The Triangle is not valid";
		System.out.println(Data);
	}
}