import java.util.*;

class LightBulb
{
	private boolean State;
	
	LightBulb()
	{
		State = false;
	}

	void turnOn()
	{
		System.out.println("On switch clicked");
		if(State)
		{
			System.out.println("Lightbulb is already turned on");
			return;
		}
		State = true;
		System.out.println("Lightbulb is turned on");
	}
	void turnOff()
	{
		System.out.println("Off switch clicked");
		if(!State)
		{
			System.out.println("Lightbulb is already turned off");
			return;
		}
		State = false;
		System.out.println("Lightbulb is turned off");
	}
}