class imp2
{
	public static void main(String[] args)
	{
		int[] arr={3,8,4,1,9};
		int big=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>big)
			{
				big=arr[i];
			}
		}
			System.out.println("Highest element is="+big);
	}

}