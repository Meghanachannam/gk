class duplicatecharacters  
{
	public static void main(String[] args) 
	{
		String str="amazon";

		String uniques="";
		String duplicates="";

		for(int i=0;i<str.length();i++)
		{
			String current=Character.toString(str.charAt(i));

			if(uniques.contains(current))
			{
				if(!duplicates.contains(current))
				{
					duplicates+=current;
					continue;
				}
			}
			uniques+=current;
		}
		System.out.println(duplicates);
	}
}