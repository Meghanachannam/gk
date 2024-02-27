 import java.util.Scanner;
 class csimp4
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int n=sc.nextInt();
		 int temp=n;
		 int rem,sum=0;
		 while(n>0)
		 {
			 rem=n%10;
			 sum=sum+rem*rem*rem;
			 n=n/10;
		 }
		 if(sum==temp)
			 System.out.print("it is a armstrong");
		 else
			 System.out.print("it is not a armstrong");

	 }
		 

 }