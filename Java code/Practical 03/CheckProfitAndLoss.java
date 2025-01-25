// Write a java program to calculate profit and loss

import java.util.*;

public class CheckProfitAndLoss
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int SellPrice, CostPrice;
		System.out.print("Enter Selling price and Cost price : ");
		SellPrice = Ani.nextInt();
		CostPrice = Ani.nextInt();
		int result = SellPrice > CostPrice ? SellPrice - CostPrice : CostPrice - SellPrice ;
		String data = SellPrice > CostPrice ? "The profit is : " : "The loss is : ";
		System.out.println(data + result);
		
	}
}