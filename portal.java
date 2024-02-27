class portal
{
	public static void main(String[]args)
	{
		String originalString="Computer Portal";
		String stringToBeInserted="Science";
		int index=8;
		StringBuilder stringBuilder=new StringBuilder(originalString);
		stringBuilder.insert(index,stringToBeInserted);
		String result=stringBuilder.toString();
		System.out.println("Output:"+result);
	}
}