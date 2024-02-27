import java.util.Scanner; 
class age
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the age:");
			int age=sc.nextInt();
			if(age>=22)
			   System.out.println("u r eligible to vote");
			else
			   System.out.println("u r not eligible to vote");
	}
}

