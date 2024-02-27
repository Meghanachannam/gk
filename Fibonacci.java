import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		//caller method
		System.out.println("Nth element of a given number is="+fib(n));
	}
	//callie method
	public static  int fib(int n)
	{
		if(n==0||n==1)
			return 0;
		 else if(n==2)
			return 1;
		 else
		return fib(n-1)+fib(n-2);
	}
}