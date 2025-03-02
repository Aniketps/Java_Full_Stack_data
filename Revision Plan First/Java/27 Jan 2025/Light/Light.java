/*

2. Create a LightBulb class
Create a LightBulb class with a field state (boolean).
Use the default constructor to set the bulb to off (false).
Add methods turnOn() and turnOff() to toggle the state and display the current state.
   Explanation: Covers state management in an object and logic toggling.

*/

import java.util.*;

class Light
{
	public static void main(String ...a)
	{
		LightBulb lightbulb = new LightBulb();
		lightbulb.turnOff();
		lightbulb.turnOn();
		lightbulb.turnOn();
		lightbulb.turnOff();
		lightbulb.turnOff();
		lightbulb.turnOn();
		lightbulb.turnOff();
		lightbulb.turnOn();
	}
}