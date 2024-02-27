import java.util.Arrays;
class leastapproach
{
	public static void main(String[] args)
	{
		int[] arr={4,7,1,3,9,6};
		int small=arr[0];
		//for each loop
		for(int i:arr)
		{
			if(i<small)
			{
				small=i;
			}
		}
		System.out.println(small);
	}
}
