import java.util.*;

class Book
{
	private String Title;
	private String Author;
	private int Price;

	Book(){}

	Book(String Title, String Author, int Price)
	{
		this.Title = Title;
		this.Author = Author;
		this.Price = Price;
	}
	
	// Setters
	void setTitle(String Title)
	{
		this.Title = Title;
	}
	void setAuthor(String Author)
	{
		this.Author = Author;
	}
	void setPrice(int Price)
	{
		this.Price = Price;
	}

	// getters
	String getTitle()
	{
		return Title;
	}
	String getAuthor()
	{
		return Author;
	}
	int getPrice()
	{
		return Price;
	}
}