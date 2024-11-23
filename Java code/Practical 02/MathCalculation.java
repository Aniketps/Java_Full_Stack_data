// Write a java program that reads a number and display the cube, and fourth power

import java.util.*;
public class MathCalculation
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int num, cube, fourthPower;
		System.out.print("Enter the number : ");
		num = Ani.nextInt();
		cube = num*num*num;
		fourthPower =  num*num*num*num;
		System.out.println("The cube is : " + cube+ " And Fourth Power is : " + fourthPower);

	}
}