class imp10
{
	public static void main(String[] args)
	{
		int[] arr={11,30,5,6,8,10};
		int max=arr[arr.length-1];
		System.out.print(max+" ");
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				System.out.print(max+" ");
			}
		}
	}
}