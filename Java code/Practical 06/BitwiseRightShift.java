// BitwiseRightShift

import java.util.*;
public class BitwiseRightShift
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int a, b, c;
		System.out.print("Enter first : ");
		a = Ani.nextInt();
		System.out.print("Shift by : ");
		b = Ani.nextInt();
		c = a>>b; 		
		System.out.println("C = " + c);
	}
}