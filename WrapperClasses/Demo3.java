class Demo3
{
	public static void main(String[] args)
	{
		Integer i1=new Integer(100);
		Integer i2=Integer.valueOf(200);
		int a1= i1.intValue();
		int a2= i2.intValue();
		System.out.println(a1+a2);
		//System.out.println(a1.toStaring());CE: it will throw an error because toString() method is cxall only to print reference variable
	}
}