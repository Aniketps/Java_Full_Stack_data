/*

4. Library Management
Create a Library class to store the name and numberOfBooks of a library. Add a method to issue a book (reduce the count by 1) and another to return a book (increase the count by 1).
Explanation: Focus on managing the count correctly through method calls and validate against negative counts.

*/
import java.util.*;

class Library
{
	public static void main(String a[])
	{
		ManageLibrary manageLibrary = new ManageLibrary();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("1. Issue Book\n2. Return Book\n3. Exit");
			System.out.print("Make choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					manageLibrary.issueBook();
					break;
				case 2:
					manageLibrary.returnBook();
					break;
				case 3:
					System.out.println("Thanks for using our service :)");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Input");
			}
		}
	}
}