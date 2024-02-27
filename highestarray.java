import java.util.Arrays;
class highestarray
{
	public static void main(String[] args)
	{
		int[] arr={4,7,1,3,9,6};
		Arrays.sort(arr);//134679
		System.out.println(arr[arr.length-1]);
	}
}
