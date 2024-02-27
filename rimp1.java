 import java.util.Scanner;
 class rimp1
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int n=sc.nextInt();
		 System.out.println("Factorial of a given number is="+factorial(n));
	 }
	 public static int factorial(int n)
	 {
		 if(n<0)
			 return-1;
		 if(n==0)
			 return 1;
		 return n*factorial(n-1);
	 }
 }