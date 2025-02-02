/*

Q2. Write program to create class name Area with methods name as void setRadius(float radius) and void setLengthWidth(int len,int wid) and two child classes name as Circle and Rectangle so you have to define float getCircleArea() method in Circle child class and calculate area of circle and return it and You have to define getRectArea() method in Rectangle class and calculate area of rectangle and return it.

*/
import java.util.*;

class CalArea
{
	public static void main(String ...a)
	{
		Circle circle = new Circle();
		circle.setRadius(12);
		circle.getCirArea();
		
		Rectangle rect = new Rectangle();
		rect.setLegthWidth(45, 20);
		rect.getRectArea();
	}
}