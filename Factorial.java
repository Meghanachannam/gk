import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		//caller method
		System.out.println("Factorial of a given number is="+fact(n));
	}
	//callie method
	public static  int fact(int n)
	{
		if(n<0)
			return -1;
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
}