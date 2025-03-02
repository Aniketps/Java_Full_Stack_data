/*

3. Food Item Details:
Create a FoodItem class with fields itemName, price, and calories.
In a FoodOrder class, implement a method to calculate the total price of multiple items, considering their prices.

*/
import java.util.*;
class FoodOrder
{
	public static void main(String ...a)
	{
		FoodItem foodItem[] = new FoodItem[3];
		foodItem[0] = new FoodItem("Chicken", 120, 438);
		foodItem[1] = new FoodItem("Avocado", 60, 234);
		foodItem[2] = new FoodItem("Pakora", 100, 190);
		
		System.out.println("Food item list");
		System.out.println("Name\t\t\tPrice\t\tCalories");
		int total = 0;
		for(FoodItem f : foodItem)
		{
			System.out.println(f.getName()+"\t\t\t"+f.getPrice()+"\t\t"+f.getCalories());
			total = total + f.getPrice();
		}
		System.out.println("Total is : "+total);
	}
}