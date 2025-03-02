import java.util.*;

class FoodItem
{
	private String Name;
	private int Price;
	private int Calories;

	FoodItem(String Name, int Price, int Calories)
	{
		setName(Name);
		setPrice(Price);
		setCalories(Calories);
	}

	// Setters
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setPrice(int Price)
	{
		this.Price = Price;
	}
	void setCalories(int Calories)
	{
		this.Calories = Calories;
	}

	// Getters
	String getName()
	{
		return Name;
	}
	int getPrice()
	{
		return Price;
	}
	int getCalories()
	{
		return Calories;
	}
}