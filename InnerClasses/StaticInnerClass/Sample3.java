class Outer3
{
	static int a=100;
	void m2()
	{
		System.out.println("Inside m1 method");
		System.out.println(a);
	}

	static class Inner3
	{
		float b=200.5f;
		static void m1()
		{
			System.out.println("Inside m1 method");
			System.out.println(new Inner3().b);
			new Outer3().m2();
		}
	}
}

class Sample3
{
	public static void main(String[] args)
	{
		Outer3.Inner3.m1();
	}
}