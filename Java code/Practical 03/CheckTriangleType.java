// Write a program to check whether the triangle is Equilateral, Isosceles or scalene using ternary operator

import java.util.*;
public class CheckTriangleType
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int s1, s2, s3;
		System.out.print("Enter three sides of Angle : ");
		s1 = Ani.nextInt();
		s2 = Ani.nextInt();
		s3 = Ani.nextInt();
		String result = (s1 == s2) && (s2 == s3)? "The Triangle is Equilateral" : (s1 == s2) && (s2 != s3)? "The Triangle is Isosceles" : (s1 != s2) && (s2 == s3)? "The Triangle is Isosceles" : "The Triangle is scalene";
		System.out.println(result);

	}
}
