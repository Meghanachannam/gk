import java.util.Arrays;
class sortingdecending 
{
	public static void main(String[] args) 
	{
		int[] arr={4,7,1,3,9,6};
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}


		
