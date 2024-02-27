class sum1
{
	public static void main(String[] args)
	{
		int[] arr1={3,5,1,9,7};
        int[] arr2={2,6,8,4,10};
		int[] resArr=new int[arr1.length];
		for(int i=0;i<arr1.length||i<arr2.length;i++)
	{
			resArr[i]=arr1[i]+arr2[i];
	}
	//display
	for(int i:resArr)
	{
		System.out.print(i+" ");
	}
}

}