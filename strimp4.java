import java.util.Scanner;
class strimp4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		String[]sarr=str.split(" ");
		for(String s:sarr)
		{
			char[]carr=s.toCharArray();

		for(int i=carr.length-1;i>=0;i--)
		{
			System.out.print(carr[i]);
		}
		System.out.print(" ");
		}
	}
}