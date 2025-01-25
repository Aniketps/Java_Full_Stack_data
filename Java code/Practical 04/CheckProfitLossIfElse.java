// Write a java program to input cost price and selling price of a product and check profit or loss.

import java.util.*;
public class CheckProfitLossIfElse
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int CostPrice, SellPrice, result;
		System.out.print("Enter Cost price: ");
		CostPrice = Ani.nextInt();
		System.out.print("Enter Selling price: ");
		SellPrice= Ani.nextInt();
		if(SellPrice > CostPrice)
		{
			result = SellPrice - CostPrice;
			System.out.println("The profit is " + result);
		}
		if(CostPrice > SellPrice )
		{
			result = CostPrice - SellPrice;
			System.out.println("The loss is " + result);
		}
		if(CostPrice == SellPrice )
		{
			System.out.println("No loss No profit");
		}
	}
}