import java.util.*;

class Value
{
	protected int a;
	protected int b;

	void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}

class Add extends Value
{
	int getAdd()
	{
		return a+b;
	}
}

class Mul extends Value
{
	int getMul()
	{
		return a*b;
	}
}

class Div extends Value
{
	float getDiv()
	{
		return a/b;
	}
}