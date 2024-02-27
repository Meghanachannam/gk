import java.util.Arrays;
class imp11
{
	public static void main(String[] args)
	{
		int[] arr={5,7,2,3,1,9,10};
		int index=5;
		int[] resArr=Arrays.copyOf(arr,arr.length-1);
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i!=index)
			{
				resArr[j++]=arr[i];
			}
		}
		for(int i:resArr)
		{
			System.out.print(i+" ");
		}
	}
}