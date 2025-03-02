import java.util.*;

class Area
{
	protected int Radius;
	protected int Length;
	protected int Width;

	void setRadius(int a)
	{
		Radius = a;
	}
	void setLegthWidth(int l, int w)
	{
		Length = l;
		Width = w;
	}
}

class Circle extends Area
{
	void getCirArea()
	{
		float area = 3.14f * Radius * Radius;
		System.out.println("Area of circle is : "+area);
	}
}

class Rectangle extends Area
{
	void getRectArea()
	{
		float area = Length * Width;
		System.out.println("Area of rectangle is : "+area);
	}
}