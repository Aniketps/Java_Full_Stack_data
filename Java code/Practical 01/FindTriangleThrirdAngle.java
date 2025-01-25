public class FindTriangleThrirdAngle
{
	public static void main(String x[])
	{
		float Angle1, Angle2, Angle3;
		Angle1 = Float.parseFloat(x[0]);
		Angle2 = Float.parseFloat(x[1]);
		Angle3 = 180 - (Angle1 + Angle2);
		System.out.println("The Third Angle is : " + Angle3);
	}
}