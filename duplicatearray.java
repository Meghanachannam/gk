class duplicatearray
{
	public static void main(String[] args)
	{
		int[]arr={4,6,1,2,2,9,6,5,3,9};
		//duplicate elements
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}