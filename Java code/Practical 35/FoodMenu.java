// 3. Food Menu System
// Task: Create a FoodItem class with itemId, name, and price. In another class Menu, create an array of FoodItem objects and write a method to display the menu and calculate the total price of all items.
// Explanation: The FoodItem class holds food item data, and Menu processes the logic for display and price calculation.


import java.util.*;
class FoodMenu
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("The count of foods : ");
		int Size = sc.nextInt();
		sc.nextLine();
		Food food[] = new Food[Size];
		
		for(int i = 0; i<Size; i++)
		{
			food[i] = new Food();
			
			// Set ID to current food
			food[i].setID(i+1);

			// Set Name to the current food
			System.out.print("Whatis food name : ");
			food[i].setName(sc.nextLine());

			// Set Price to current food item
			System.out.print("Food price : ");
			food[i].setPrice(sc.nextInt());
			sc.nextLine();
		}
		
		// Calculate Total
		int total = 0;
		for(Food f: food)
		{
			total = total + f.getPrice();
		}
		System.out.println("The total is : "+total);
	}
}