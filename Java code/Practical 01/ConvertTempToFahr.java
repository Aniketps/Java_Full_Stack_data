public class ConvertTempToFahr
{
	public static void main(String x[])
	{
		float F, C;
		C = Float.parseFloat(x[0]);
		F = (C * 9/5) + 32;
		System.out.println("Temperature in Fahrenheit is : " + F);
	}
}