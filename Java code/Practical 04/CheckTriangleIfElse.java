// Write a java program to check whether triangle is valid or not.


import java.util.*;
public class CheckTriangleIfElse
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int a1, a2, a3;
		System.out.print("Enter Angle 1 : ");
		a1 = Ani.nextInt();
		System.out.print("Enter Angle 2 : ");
		a2 = Ani.nextInt();
		System.out.print("Enter Angle 3 : ");
		a3 = Ani.nextInt();
		if((a1 + a2 + a3) == 180 && a1 > 0 && a2 > 0 && a3 > 0)
		{
			System.out.println("It is Triangle");
		}
		else
		{
			System.out.println("It is not a triangle");
		}
	}
}