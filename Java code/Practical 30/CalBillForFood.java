// 2. Food Item Details:
// Create a FoodItem class with fields itemName, price, and calories.
// In a FoodOrder class, implement a method to calculate the total price of multiple items, considering their prices

import java.util.*;

public class CalBillForFood
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Total items : ");
		int size = sc.nextInt();
		
		FoodItem foodItem[] = new FoodItem[size];
		
		for(int i = 0; i<size; i++)
		{
			foodItem[i] = new FoodItem();	

			System.out.print("What is Food name : ");
			String Name = sc.next();
			foodItem[i].setItemName(Name);
		
			System.out.print("What is Food Price: ");
			int price = sc.nextInt();
			foodItem[i].setPrice(price);

			System.out.print("Total Calories in Food : ");
			int calories = sc.nextInt();
			foodItem[i].setCalories(calories);
		}

		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setFoodItem(foodItem);
		foodOrder.getBill();
	}
}

class FoodItem
{
	String itemName;
	int price;
	int calories;

	void setItemName(String name)
	{
		itemName = name;
	}
	void setPrice(int Price)
	{
		price = Price;
	}
	void setCalories(int Calories)
	{
		calories = Calories;
	}

	String getItemName()
	{
		return itemName;
	}
	int getPrice()
	{
		return price;
	}
	int getCalories()
	{
		return calories;
	}
}

class FoodOrder
{
	FoodItem foodItem[];

	void setFoodItem(FoodItem ...f)
	{
		foodItem = f;
	}
	void getBill()
	{
		int total = 0;
		for(int i = 0; i<foodItem.length; i++)
		{
			System.out.print(foodItem[i].getItemName() + " price "+foodItem[i].getPrice()+" with calories of  "+ foodItem[i].getCalories());
			total = total + foodItem[i].getPrice()+"\n";
		}
		System.out.print("\nTotal bill is : "+total);
	}
}