class repeatingarray
{
	public static void main(String[] args)
	{
		int[] arr={4,6,1,2,3,9,6,5,2,3,2,8,2};
		int maxCount=0;
		int element=0;
		for(int i=0;i<arr.length;i++)
		{
			int Cnt=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					Cnt++;
				}
			}
			if(maxCount<Cnt)
			{
				maxCount=Cnt;
				element=arr[i];
			}
		}
		System.out.println(element+" is repeating for "+maxCount+"times" );
	}
}


