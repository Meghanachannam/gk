class Uniquearray
{
	public static void main(String[] args) 
	{
		int[] arr={4,6,1,2,3,9,6,5,2,3};

		//unique number 
		for(int i=0;i<arr.length;i++)
		{
			int cnt=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					cnt++;
				}
			}
				if(cnt==1)
				{
					System.out.print(arr[i]+" ");
				}
			}
		
	}
}
