class remarray
{
	public static void main(String[] args)
	{
		int[] arr1={3,5,10,9,17};
		int[] arr2={2,6,8,4,5};
		int sum=0;
		int rem=0;
		for(int i=0;i<arr1.length;i++)
		{
			rem=arr1[i]%arr2[i];
			sum=sum+rem;
}
System.out.println(sum);
	}
}