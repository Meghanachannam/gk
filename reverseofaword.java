class reverseofaword  
{
	public static void main(String[] args) 
	{
		String str="I am Meghana ";

		String[] sarr=str.split(" "); // I  am   Meghana

		String rev="";

		//for each loop 
		for(String s:sarr)
		{
			char[] carr=s.toCharArray(); // i s 

			//reading reverse
			for(int i=carr.length-1;i>=0;i--)
			{
				rev+=carr[i];
			}
			//add the space
			rev+=" ";
		}

		System.out.println(rev);
	}
}