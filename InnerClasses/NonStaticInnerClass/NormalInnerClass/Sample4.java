class Outer5
{
	int a=100;
	float b=200.5f;
	class Inner5
	{
		int a=1000;
		float b=2000.5f;
		void m2(int a, float b)
		{
			System.out.println("Inside m2 method");
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(Outer5.this.a+ Outer5.this.b);
		}
	}
}
class Sample4
{
	public static void main(String[] args)
	{
		new Outer5().new Inner5().m2(10,20.5f);
	}
}