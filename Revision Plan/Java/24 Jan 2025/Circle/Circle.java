import java.util.*;

class Circle
{
	private int Radius;
	Circle()
	{
		Radius = 10;
	}
	void calculateCircumference()
	{
		System.out.println("The Circumference is "+(2 * (3.14) * Radius));
	}
}