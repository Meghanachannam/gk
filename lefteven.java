class lefteven
{
	public static void main(String[] args)
	{
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int num=(i-1)*4+j*2;
					System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
