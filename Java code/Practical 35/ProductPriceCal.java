// 1. Product Price Calculation
// Task: Create a Product class with productId, productName, and price. Implement a constructor to initialize these values. In another class ProductCatalog, create an array of Product objects and write a method to calculate the total price of all products.
// Explanation: The Product class holds product details, and the ProductCatalog performs logic for price calculation.

import java.util.*;
public class ProductPriceCal
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many products are there?  ");
		int size = sc.nextInt();
		sc.nextLine();
		Product product[] = new Product[size];
		PriceCal priceCal = new PriceCal();
		
		for(int i = 0; i<size; i++)
		{
			product[i] = new Product();
			product[i].setID(i+1);

			System.out.print("Name of an product : ");
			String Name = sc.nextLine();
			product[i].setName(Name);

			System.out.print("Price : ");
			int Price = sc.nextInt();
			sc.nextLine();
			product[i].setPrice(Price);
		}
		System.out.println("The total is : "+priceCal.calculate(product));
	}
}