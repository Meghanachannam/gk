

import java.util.Scanner;
class Example3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the M1 value:");
		int M1=sc.nextInt();
		System.out.println("Enter the M2 value;");
		int M2=sc.nextInt();
        System.out.println("Enter the M3 value:");
		int M3=sc.nextInt();
		System.out.println("Enter the M4 value;");
		int M4=sc.nextInt();
        System.out.println("Enter the M5 value:");
		int M5=sc.nextInt();
		System.out.println("Enter the M6 value;");
		int M6=sc.nextInt();
		int total=M1+M2+M3+M4+M5+M6;
		System.out.println("total of given numbers is="+total);
		float avg=0.16f*total;
		System.out.println("average of given numbers is="+avg);

	}
}
