class tripletarray
{
	public static void main(String[] args)
	{
		int[] arr={6,8,1,3,5,4,2};
		int sum=9;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;j++)
				{
					if(arr[i]+arr[j]+arr[k]==sum)
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}
}