class reversename  
{
	public static void main(String[] args) 
	{
		String str="world";

		char[] carr=str.toCharArray(); // w  o  r  l  d 

		String rev="";

		//reading reverse
		for(int i=carr.length-1;i>=0;i--)
		{
			rev+=carr[i];
		}

		System.out.println(rev);
	}
}
