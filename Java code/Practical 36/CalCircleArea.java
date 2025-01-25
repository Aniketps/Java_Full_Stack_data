// 2. Create a Circle class
// Create a Circle class with a radius field.
// Use a default constructor to set the radius to 10.
// Add a method calculateCircumference() to calculate and display the circumference using the formula 2 * π * radius.
// Explanation: This question reinforces object-oriented principles and demonstrates mathematical operations with classes.

import java.util.*;

class Circle
{
	// First i initialized the instance variables
	int radius;
	
	// Here the default constructor
	Circle()
	{
		radius = 10;
	}

	void ShowArea()
	{
		System.out.println("The circumference of Circle is "+ (float)(2 * 3.14 * radius) );
	}
	
}

class CalCircleArea
{
	public static void main(String x[])
	{
		Circle circle = new Circle();
		circle.ShowArea();
	}
}