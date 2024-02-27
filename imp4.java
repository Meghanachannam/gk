class imp4
{
	public static void main(String[] args)
	{
		int[] arr={3,8,4,1,9,3,4};
		
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
					System.out.print(arr[i]+" ");
				}
			}
		}