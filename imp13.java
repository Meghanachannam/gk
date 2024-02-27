import java.util.Arrays;
class imp13
{
	public static void main(String[] args)
	{
		int[] arr={5,3,7,4,9,1,6};
		int loc=3;
		int element=100;
		arr=Arrays.copyOf(arr,arr.length+1);
		for(int i=arr.length-1;i>=loc;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[loc]=element;
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}