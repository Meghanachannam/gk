 import java.util.Scanner;
 class rimp2
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int n=sc.nextInt();
		 System.out.println("Fibonacci of a given number is="+fibonacci(n));
	 }
	 public static int fibonacci(int n)
	 {
		 if((n==0)||(n==1))
			 return 0;
		 if(n==2)
			 return 1;
		 return fibonacci(n-1)+fibonacci(n-2);
	 }
 }