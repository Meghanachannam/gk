import java.util.Scanner;
class Example1  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height:");
		int h=sc.nextInt();
		System.out.println("Enter the breadth:");
		int b=sc.nextInt();
		float area=0.5f*h*b;
		System.out.println("Area of the triangle is="+area);

	}
}
