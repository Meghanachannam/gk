class stringformat
{
	public static void main(String[] args) 
	{
		String str="M3A2G1G1I5E9";

		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i)); // M A G G I E  
			}
			else
			{
				int j=Character.getNumericValue(str.charAt(i)); //2 
				for(int k=1;k<j;k++)
				{
					System.out.print(str.charAt(i-1));	
				}
			}
		}
	}
}


















 


