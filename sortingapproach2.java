class sortingapproach2
{
	public static void main(String[] args) 
	{
		int[]arr={4,7,1,3,9,6};
		//decending logic
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//reading the elements
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}

