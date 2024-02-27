class imp15
{
	public static void main(String[] args)
	{
		int[]arr={5,3,6,4};
		int sum_of_elements=arr.length-1;
		int sum=((sum_of_elements)*(sum_of_elements+1))/2;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum-arr[i];
		}
		System.out.print("missing element is="+sum);
	}
}