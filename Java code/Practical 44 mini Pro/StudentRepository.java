import java.util.*;

class StudentRepository
{
	Student user = null;
	Scanner sc = new Scanner(System.in);
	StudentRepository(){}
	ManageLibrary manageLibrary = null;
	StudentRepository(Student user, ManageLibrary m)
	{
		this.user = user;
		manageLibrary = m;
	}
	void useLibrary()
	{
		System.out.println("------------------------ Welcome "+user.getName()+" in Library ----------------------");
		while(true)
		{
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1. View All Books\n2. Issue new Book\n3. Profile\n4. Self Issued Books\n5. Total Book Count in Library\n6. Available Books\n7. Return Book\n8. Logout");
			System.out.print("Make choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					if(user.getStatus().equals("Pending") || user.getStatus().equals("Rejected"))
					{
						System.out.println("Application is not Approved");
						break;
					}
					manageLibrary.availableBooks();
					break;
				case 2:
					if(user.getStatus().equals("Pending") || user.getStatus().equals("Rejected"))
					{
						System.out.println("Application is not Approved");
						break;
					}
					manageLibrary.issueNewBook(user);
					break;
				case 3:
					System.out.println("ID\tName\t\tEmail\t\t\tContact\t\tDepName\t\tYear");
					System.out.println(user.getID()+"\t"+user.getName()+"\t\t"+user.getEmail()+"\t\t\t"+user.getContact()+"\t\t"+user.getDepName()+"\t\t"+user.getYear());
					System.out.println("1. Change Name\n2. Update Email\n3. Update Contact\n4. Update Department\n5. Update Year\n6. Exit()");
					System.out.print("Make choice : ");
					int choice1 = sc.nextInt();
					sc.nextLine();
					switch(choice1)
					{
						case 1:
							System.out.print("New Name : ");
							user.setName(sc.nextLine());
							System.out.println("Name Updated");
							break;
						case 2:
							System.out.print("New Email : ");
							user.setEmail(sc.nextLine());
							System.out.println("Email Updated");
							break;
						case 3:
							System.out.print("New Contact : ");
							user.setContact(sc.nextLine());
							System.out.println("Contact Updated");
							break;
						case 4:
							System.out.print("Change Department : ");
							user.setDepName(sc.nextLine());
							System.out.println("Department Updated");
							break;
						case 5:
							System.out.print("Update Year : ");
							user.setYear(sc.nextLine());
							System.out.println("Year Updated");
							break;
						case 6:
							break;
						default:
							System.out.println("Invalid Input");
					}
					break;
				case 4:
					if(user.getStatus().equals("Pending") || user.getStatus().equals("Rejected"))
					{
						System.out.println("Application is not Approved");
						break;
					}
					System.out.println("----------------------------- Self Issued Books ----------------------------------");
					System.out.println("ID\t\tName\t\tAuthor\t\tSubject\t\tIsBn");
					for(int i = 0; i<user.getBooks().length; i++)
					{
						if(user.getBooks()[i] == null){break;}
						System.out.println(user.getBooks()[i].getID()+"\t\t"+user.getBooks()[i].getName()+"\t\t"+user.getBooks()[i].getAuthor()+"\t\t"+user.getBooks()[i].getSubject()+"\t\t"+user.getBooks()[i].getIsBn());
					}
					break;
				case 5:
					if(user.getStatus().equals("Pending") || user.getStatus().equals("Rejected"))
					{
						System.out.println("Application is not Approved");
						break;
					}
					manageLibrary.availableBookCount();
					break;
				case 6:
					if(user.getStatus().equals("Pending") || user.getStatus().equals("Rejected"))
					{
						System.out.println("Application is not Approved");
						break;
					}
					manageLibrary.availableNotIssuedBooks();
					break;
				case 7:
					if(user.getStatus().equals("Pending") || user.getStatus().equals("Rejected"))
					{
						System.out.println("Application is not Approved");
						break;
					}
					if(user.CurrentBookCount == 0)
					{
						System.out.println("No books available");
						break;
					}
					manageLibrary.returnBook(user);
					break;
				case 8:
					return;
				default:
					System.out.println("Invalid Input");
			}
		}
	}
}