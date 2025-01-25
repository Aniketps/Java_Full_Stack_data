/*

1. Create a Rectangle class
Create a Rectangle class with length and breadth as instance variables.
Write a default constructor that assigns both values to 5.
Add a method area() to calculate and display the area of the rectangle.
Explanation: This practice teaches how to initialize instance variables using the default constructor and perform a calculation.

*/

import java.util.*;

class Area
{
	public static void main(String ...a)
	{
		Rectangle rectangle = new Rectangle();
		System.out.println("The are is : "+ rectangle.getArea());
	}
}