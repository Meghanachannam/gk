import java.util.Arrays;
class highestapproach
{
	public static void main(String[] args)
	{
		int[] arr={4,7,1,3,9,6};
		int big=arr[0];
		//for each loop
		for(int i:arr)
		{
			if(i>big)
			{
				big=i;
			}
		}
		System.out.println(big);
	}
}
