class missingarray
{
	public static void main(String[] args)
	{
		int[] arr={6,1,3,5,7,2};
		int sum_of_arr_ele=arr.length+1;
		int sum=(sum_of_arr_ele*(sum_of_arr_ele+1))/2;
		//for each loop
		for(int i:arr)
		{
			sum=sum-i;
		}
		System.out.println("Missing element is="+sum);
	}
}