class A
{
	final void show()
	{
		System.out.println("Test Parent");
	}
}
class B extends A
{
	void show(int a)
	{
		System.out.println("Test Child");
	}
}

class testOverride
{
	public static void main(String ...x)
	{
		B b = new B();
		b.show(10);
	}
}