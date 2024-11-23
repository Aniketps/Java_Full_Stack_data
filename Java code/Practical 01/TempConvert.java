public class TempConvert
{
	public static void main(String x[])
	{
		float F, C;
		F = Float.parseFloat(x[0]);
		C = (F - 32) * 5 / 9;
		System.out.println("Temperature in Celsius is : " + C); 
	}
}