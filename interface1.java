interface A
{
	//abstract method
	public abstract void m1();
}
class B implements A
{
	public void m1()
	{
		System.out.println("M1-Method");
	}
}
class interface1
{
	public static void main(String[] args)
	{
		A a=new B();
		a.m1();
	}
}