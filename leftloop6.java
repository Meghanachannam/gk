class leftloop6 
{
	public static void main(String[] args) 
	{
		//rows
		for(int i=1;i<=4;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=i;j++)
				{
					if(j>1)
						System.out.print("#"+j);
					else
						System.out.print(j);
				}
				//new line
				System.out.println();
			}
			else
			{
				for(int j=i;j>=1;j--)
				{
					if(j>1)
						System.out.print(j+"#");
					else
						System.out.print(j);
				}
				//new line
				System.out.println();
			}
		}
	}
}
