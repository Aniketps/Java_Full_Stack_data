class Book
{
	private int ID;
	private String Title;
	private String Author;
	private int Price;

	// Set methods for setting data to instance variables
	void setID(int ID)
	{
		this.ID = ID;
	}
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

	// Get Data from variables
	int getID()
	{
		return ID;
	}
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
