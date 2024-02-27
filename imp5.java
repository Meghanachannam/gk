class imp5
{
	public static void main(String[] args)
	{
		int[] arr={3,8,4,1,9,5,6,4,3,4};
		int maxCount=0;
		int ele=0;
		
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
				if(maxCount<cnt)
			{
					maxCount=cnt;
					ele=arr[i];
			}
		}
					System.out.print(ele+"repeating for"+maxCount+"times");
				}
			}
		