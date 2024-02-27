import java.util.Scanner;
class strimp3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		String[]sarr=str.split(" ");
		for(int i=sarr.length-1;i>=0;i--)
		{
			System.out.print(sarr[i]+" ");
		}
	}
}