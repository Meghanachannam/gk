import java.util.Scanner;
class fact  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt(); // 5

		int i=n,fact=1;
		do
		{
			fact=fact*i;
			i--;
		}
		while (i>=1);

		System.out.println(fact);
	}
}

