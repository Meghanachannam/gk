import java.util.*;
class array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		//inserting the elements
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the elements of arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
			System.out.println("Given elements are:");
			//display the elements
			for(int i=0;i<size;i++)
		{
				System.out.print(arr[i]+" ");
		}
	}

}