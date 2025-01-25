// 3. Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

import java.util.*;

class Shape
{
	void getArea(int a, int b)
	{
		System.out.println("The data is "+a+" and "+b);
	}
}

class Rectangle extends Shape
{
	void getArea(int a, int b)
	{
		System.out.println("The area of Rectangle is "+a*b);
	}
}

class CalArea
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Height and Width : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Rectangle rectangle = new Rectangle();
		rectangle.getArea(a,b);
	}
}