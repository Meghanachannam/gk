class ClassA
{
	public String meth1(String a)
	{
		System.out.println("core java");
		return "welcome";
		ClassA a=new ClassA();
		a.meth2();
	}
	public void meth2()
	{
		System.out.println("adv");
	}
		public static void main(String[] args)
	{
			ClassA a=new ClassA();
			int result= a.meth1();
			System.out.println(result);
			
	}
}