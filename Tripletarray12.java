class Tripletarray12
{
	public static void main(String[] args)
	{
		int[] arr={6,8,1,3,5,4,2,5,6,1,2};
		int sum=9;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
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