class leftrstring  
{
	public static void main(String[] args) 
	{
		String str="Meghana";

		int cnt=3;

		//convert string to char array
		char[] carr=str.toCharArray();


		String str1=str.substring(0,carr.length-cnt);

		String str2=str.substring(carr.length-cnt,carr.length);

		System.out.println(str2+str1);
	}
}