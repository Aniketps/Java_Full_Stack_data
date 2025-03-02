import java.util.*;

class ManageLibrary
{
	private String Name;
	private int numberOfBooks;

	ManageLibrary()
	{
		Name = "Gyan";
		numberOfBooks = 5;
	}
	void issueBook()
	{
		if(numberOfBooks<=0)
		{
			System.out.println("Not books available to Issue");
			return;
		}
		numberOfBooks--;
		System.out.println("Book Issued");
		System.out.println("Current book count is "+numberOfBooks);
	}
	void returnBook()
	{
		numberOfBooks++;
		System.out.println("Book Returned");
		System.out.println("Current book count is "+numberOfBooks);
	}
}	