import java.util.Arrays;
class imp7
{
	public static void main(String[] args)
	{
		int[] arr={3,5,9,6,4,8,7,1,2};
		Arrays.sort(arr);
		System.out.print(arr[arr.length-1]+" ");
		System.out.print(arr[arr.length-2]+" ");
		System.out.print(arr[arr.length-3]+" ");
	}

}