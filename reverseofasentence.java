class reverseofasentence  
{
	public static void main(String[] args) 
	{
		String str="I am Meghana";

		String[] sarr=str.split(" "); 

		String rev="";

		//reading reverse
		for(int i=sarr.length-1;i>=0;i--)
		{
			rev+=sarr[i]+" ";
		}
		System.out.println(rev);
	}
}
