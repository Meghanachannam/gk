import java.util.*;
class sumarray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int []arr=new int[size];
		//inserting the elements
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the elemnts of arr["+i+"]:");
				arr[i]=sc.nextInt();
		}
		int sum=0;
		//logic
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.print("sum of array elements="+sum);
	}


}