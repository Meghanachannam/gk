import java.util.Arrays;
class imp12
{
	public static void main(String[] args)
	{
		int[] arr={6,5,7,2,3,1,5,9,10,4,5};
		int element=5;
		int[] resArr=Arrays.copyOf(arr,arr.length-1);
		int j=0,cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]==element)&&cnt==0)
			{
				cnt++;
				continue;
			}
			resArr[j++]=arr[i];
		}
		for(int i:resArr)
		{
			System.out.print(i+" ");
		}
	}
}