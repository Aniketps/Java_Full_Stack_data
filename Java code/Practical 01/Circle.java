public class Circle
{
	public static void main(String x[])
	{
		float radius, diameter;
		double circumference;
		radius = Float.parseFloat(x[0]);
		diameter = 2 * radius;
		circumference = 2 * 3.14 * radius;
		System.out.println("Circle Diameter is : " + diameter + "\n Circle Circumference  is : " + circumference);
	}
}