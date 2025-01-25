import java.util.*;

class Library
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		ManageLibrary manageLibrary = new ManageLibrary();
		User user = null;
		while(true)
		{
			System.out.println("--------------------------------- Registration & Login ---------------------------------");
			System.out.println("1. New Application\n2. Login\n3. Exit()");
			System.out.print("Make Choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					manageLibrary.newRegistration();
					break;
				case 2:
					System.out.print("Email : ");
					String LEmail = sc.nextLine();
					System.out.print("Password : ");
					String LContact = sc.nextLine();
					manageLibrary.Login(LEmail, LContact);
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Input");
			}
		}
	}
}