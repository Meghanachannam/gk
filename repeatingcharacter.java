class  repeatingcharacter
{
	public static void main(String[] args) 
	{
		String str="kietgroupofinstitutions";

		int maxCount=0;                  
		char character=' ';

		for(int i=0;i<str.length();i++)
		{
			int cnt=0;

			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					cnt++;
				}
			}
			if(maxCount<cnt)
			{
				maxCount=cnt;
				character=str.charAt(i);
			}
		}
		System.out.println(character+" is repeating for "+maxCount+" times");

	}
}