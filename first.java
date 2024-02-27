class first
{
	public static void main(String[] args)
	{
		int[] arr={6,3,2,1,9,2,7,4,2};
		int element=2;
			int[] resArr=new int[arr.length-1];
		int cnt=0,j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element&&cnt==0)
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