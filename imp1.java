class imp1
{
	public static void main(String[] args)
	{
		int[] arr={3,8,4,1,9};
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
			System.out.println("Smallest element is="+small);
	}

}