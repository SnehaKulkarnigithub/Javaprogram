class Demo1
{
	public static void main(String[] args)
	{
		//Float
		Float f1=new Float(100.5f);
		System.out.println(f1);

		Float f2=new Float(200.5f);
		System.out.println(f2);

		Float f3= new Float(300.5f);
		System.out.println(f3);

		//Character
		Character c1=new Character('x');
		System.out.println(c1);
		
		// here unicode value not allowed in wrapper class
		/*
		Character c2=new Character(97);CE
		System.out.println(c2);CE
		*/
	}
}