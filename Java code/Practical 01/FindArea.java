public class FindArea
{
	public static void main(String x[])
	{
		float h, w, area;
		h = Float.parseFloat(x[0]);
		w = Float.parseFloat(x[1]);
		area = h * w;
		System.out.println("Area of Square is :" + area);
	}
}