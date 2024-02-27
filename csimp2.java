 import java.util.Scanner;
 class csimp2
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int n=sc.nextInt();
		 int rem,rev=0;
		 while(n>0)
		 {
			 rem=n%10;
			 rev=rev*10+rem;
			 n=n/10;
		 }
		 System.out.println("reverse of digits of a given number is="+rev);
	 }
		 

 }