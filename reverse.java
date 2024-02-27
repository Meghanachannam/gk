class reverse
{
	public static void main(String[] args)
	{
		String str="This is java class";
		String[]sarr=str.split(" ");
		String rev=" ";
		for(String s:sarr)
		{
			char[] carr=s.toCharArray();
			for(int i=carr.length-1;i>=0;i--)
			{
				rev+=carr[i];
			}
			rev+=" ";
		}
		System.out.println(rev);
	}
}