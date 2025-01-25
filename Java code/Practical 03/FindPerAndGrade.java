// Write a java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer
// Calculate percentage and grade according to following 


import java.util.*;
public class FindPerAndGrade
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int Math, Phy, Che, Bio, Comp;
		System.out.print("Enter marks got in Mathematics : ");
		Math = Ani.nextInt();

		System.out.print("Enter marks got in Physics : ");
		Phy = Ani.nextInt();

		System.out.print("Enter marks got in Chemistry: ");
		Che = Ani.nextInt();

		System.out.print("Enter marks got in Biology: ");
		Bio= Ani.nextInt();

		System.out.print("Enter marks got in Computer: ");
		Comp = Ani.nextInt();
		
		float per = (Math + Phy + Che + Bio + Comp)/5;
		String grade = per>=90? "Grade A" : per>=80? "Grade B" : per>=70? "Grade C" : per>=60? "Grade D" : per>=40? "Grade E" : "Grade F";
		System.out.println("The percentage is " +  per + " and " + grade); 
	}
}