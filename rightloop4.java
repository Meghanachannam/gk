class rightloop4  
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
				System.out.print("*");
			}
			//new line 
			System.out.println();
		}
		for(int i=3;i>=1;i--)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}