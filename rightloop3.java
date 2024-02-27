class rightloop3  
{
	public static void main(String[] args) 
	{
		//rows
		for(int i=1;i<=4;i++)
		{
			//space 
			for(int j=4;j>i;j--)
			{
				System.out.print("  ");
			}

			//right side elements
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			//new line 
			System.out.println();
		}
	}
}