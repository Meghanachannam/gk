class multiplyarr
{
	public static void main(String[] args)
	{
		int[] arr1={2,5,1,3,4}; 
		int[] arr2={5,8,6,4,9};

		int[] resArr=new int[arr1.length];

		for(int i=0;i<arr1.length && i<arr2.length;i++)
		{
			resArr[i]=arr1[i]*arr2[i];
		}

		//display
		for(int i:resArr)
		{
			System.out.print(i+" ");
		}
	}
}