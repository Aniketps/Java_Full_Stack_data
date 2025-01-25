import java.util.*;
public class Enquiries
{
	// Enquiry Data to Take
	int ID;
	String Name;
	String Email;
	String Contact;
	String Education;
	boolean isEnrolled;
	Courses course;
	Courses courses[];
	Batches batch;
	Batches batches[];
	Scanner sc = new Scanner(System.in);

	// helping variables
	boolean isBatchSelected = false;
	boolean isCourseSelected = false;

	// Set Student data
	void setBatch(Batches ...batches)
	{
		batches = batches;
		System.out.println("Available Batches");
		System.out.println("ID \t Name \t Start date \t Enpected End Date\n");
		for(Batches b: batches)
		{
			System.out.println(b.getID()+"\t"+b.getName()+"\t"+b.getStartDate()+"\t"+b.getEndDate());
		}
		System.out.print("\nSelect batch by enterying batch id : ");
		int id = sc.nextInt();
		for(Batches b: batches)
		{
			if(b.getID()==id)
			{
				batch = b;
				isBatchSelected = true;
			}
		}
		if(!isBatchSelected)
		{
			System.out.println("Invalid Input, Try Again");
			setBatch(batches);
		}
	}
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setEmail(String Email)
	{
		this.Email = Email;
	}
	void setContact(String Contact)
	{
		this.Contact = Contact;
	}
	void setID(int ID)
	{
		this.ID = ID;
	}
	void setEducation(String Education)
	{
		this.Education = Education;
	}
	void setStatus(boolean isEnrolled)
	{
		this.isEnrolled = isEnrolled;
	}
	void setCourse(Courses ...courses)
	{
		this.courses = courses;

		System.out.print("Here are the available courses\nID \t Course Name \t Duration \t Fees\n");
		for(int i = 0; i<courses.length; i++)
		{
			System.out.println(courses[i].getID()+"\t"+courses[i].getName()+"\t"+courses[i].getDuration()+"\t\t"+courses[i].getFees());
		}
		System.out.print("\nSelect Course Above by course id : ");
		int id = sc.nextInt();
		for(Courses c: courses)
		{
			if(id==c.getID())
			{
				course = c;
				isCourseSelected = true;
				break;
			}
		}
		if(!isCourseSelected)
		{
			System.out.println("Invalid Input, Try Again");
			setCourse(courses);
		}
	}

	// Get Data of Student who took enquiry
	
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	String getEmail()
	{
		return Email;
	}
	String getContact()
	{
		return Contact;
	}
	String getEducation()
	{
		return Education;
	}
	boolean getStatus()
	{
		return isEnrolled;
	}
	String getCourse()
	{
		return course.getName();
	}
	String getBatch()
	{
		return batch.getName();
	}
}