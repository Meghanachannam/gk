class Dup
{
	public static void main(String[] args)
	{
		int[] arr={2,6,3,5,4,5,4,7,8,1,};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println(i+" ");
			}
		}
	}
}