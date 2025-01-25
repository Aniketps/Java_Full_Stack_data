import java.util.*;
public class InstituteManagementApp
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		DisplayAvailableData displayAvailableData = new DisplayAvailableData();
	
		System.out.print("How many Courses are available?");
		int CoursesSize = sc.nextInt();
		Courses courses[] = new Courses[CoursesSize];
		for(int i = 0; i<CoursesSize; i++)
		{
			courses[i] = new Courses();
		
			int id;
			boolean isSame = false;
			
			do
			{
				isSame = false;
				System.out.print("Course ID : ");
				id = sc.nextInt();
				for(int j = 0; j<=i; j++)
				{
					if(courses[j].getID() == id)
					{
						isSame = true;
						System.out.println("ID already exists try another one ");
						break;
					}
				}
			}
			while(isSame);
			courses[i].setID(id);
			
			sc.nextLine();

			System.out.print("Course Name : ");
			String name = sc.nextLine();
			courses[i].setName(name);

			System.out.print("Course Duration : ");
			String Duration = sc.nextLine();
			courses[i].setDuration(Duration);

			System.out.print("Course Fees : ");
			int Fees = sc.nextInt();
			courses[i].setFees(Fees);
			sc.nextLine();
			
		}
		displayAvailableData.setCourses(courses);
		displayAvailableData.AvailableCourses();

		
		System.out.print("How many Batches are available?");
		int BatchesSize = sc.nextInt();
		Batches batches[] = new Batches[BatchesSize];
		for(int i = 0; i<BatchesSize; i++)
		{
			batches[i] = new Batches();
		
			int id;
			boolean isSame = false;
			
			do
			{
				isSame = false;
				System.out.print("Batch ID : ");
				id = sc.nextInt();
				for(int j = 0; j<=i; j++)
				{
					if(batches[j].getID() == id)
					{
						isSame = true;
						System.out.println("ID already exists try another one ");
						break;
					}
				}
			}
			while(isSame);
			batches[i].setID(id);

			sc.nextLine();

			System.out.print("Batch Name : ");
			String name = sc.nextLine();
			batches[i].setName(name);

			System.out.print("Batch Start Date : ");
			String StartDate = sc.nextLine();
			batches[i].setStartDate(StartDate);

			System.out.print("Batch Expected End Date : ");
			String EndDate = sc.nextLine();
			batches[i].setEndDate(EndDate);
	
		}
		displayAvailableData.setBatches(batches);
		displayAvailableData.AvailableBatches();
				
		System.out.print("How many Studends came for Enquiry?");
		int EnquirySize = sc.nextInt();
		Enquiries enquiries[] = new Enquiries[EnquirySize];
		for(int i = 0; i<EnquirySize; i++)
		{
			enquiries[i] = new Enquiries();
		
			int id;
			boolean isSame = false;
			
			do
			{
				isSame = false;
				System.out.print("Enquiry ID : ");
				id = sc.nextInt();
				for(int j = 0; j<=i; j++)
				{
					if(enquiries[j].getID() == id)
					{
						isSame = true;
						System.out.println("ID already exists try another one ");
						break;
					}
				}
			}
			while(isSame);
			enquiries[i].setID(id);

			sc.nextLine();

			System.out.print("Student Name : ");
			String name = sc.nextLine();
			enquiries[i].setName(name);

			System.out.print("Student Email : ");
			String Email = sc.nextLine();
			enquiries[i].setEmail(Email);

			System.out.print("Student Education : ");
			String Education = sc.nextLine();
			enquiries[i].setEducation(Education);

			System.out.print("Student Contact : ");
			String Contact = sc.nextLine();
			enquiries[i].setContact(Contact);
		
			enquiries[i].setCourse(courses);
			enquiries[i].setBatch(batches);

			System.out.print("Is Student taking admission Y/n : ");
			char isEnrolled = sc.next().charAt(0);
			enquiries[i].setStatus((isEnrolled=='Y' || isEnrolled == 'y')? true : false);

			sc.nextLine();
		}
		displayAvailableData.setEnquiries(enquiries);
		displayAvailableData.AvailableEnquiries();
		displayAvailableData.TrueAvailableEnquiries();
		displayAvailableData.FalseAvailableEnquiries();
		displayAvailableData.CourseWiseStudents();
		displayAvailableData.BatchWiseStudents();
	}		
}