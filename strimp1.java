import java.util.Scanner;
class strimp1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		char[]carr=str.toCharArray();
		String rev="";
		for(int i=carr.length-1;i>=0;i--)
		{
			rev+=carr[i];
		}
		System.out.println("Reverse of a string="+rev);
	}
}