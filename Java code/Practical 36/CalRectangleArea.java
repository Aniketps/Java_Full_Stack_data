// 1. Create a Rectangle class
// Create a Rectangle class with length and breadth as instance variables.
// Write a default constructor that assigns both values to 5.
// Add a method area() to calculate and display the area of the rectangle.
// Explanation: This practice teaches how to initialize instance variables using the default constructor and perform a calculation.

import java.util.*;

class Rectangle
{
	// First i initialized the instance variables
	int length;
	int breadth;
	
	// Here the default constructor
	Rectangle()
	{
		length = 5;
		breadth = 5;
	}

	void ShowArea()
	{
		System.out.println("The  area of Rectangle is "+ length*breadth);
	}
	
}

class CalRectangleArea
{
	public static void main(String x[])
	{
		Rectangle rectangle = new Rectangle();
		rectangle.ShowArea();
	}
}