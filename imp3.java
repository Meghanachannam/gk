class important3
{
	public static void main(String[] args)
	{
		int[] arr={3,8,4,1,9};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]+" ");
				}
			}
		}
	}

}