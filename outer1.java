class Outer1 
{
	class Inner 
	{
		public void m1()
		{
			System.out.println("Inner-M1 Method");
		}
	}

	public void m2()
	{
		Inner i=new Inner();
		i.m1();
	}

	public static void main(String[] args) 
	{
		Outer1 o=new Outer1();
		o.m2();
	}
}
