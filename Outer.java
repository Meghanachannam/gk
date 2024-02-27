class Outer
{
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner-M1 Method");
		}
	}
	public static void main(String[] args)
	{
		Outer.Inner i=new Outer().new Inner();
		i.m1();

	}
}