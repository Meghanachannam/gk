import java.util.Arrays;
class palindromes
{
	public static void main(String[] args)
	{
		String str="racar is madam for java";
		String[] sarr=str.split(" ");//racar  is  madam  for  java
		//for each loop
		for(String s:sarr)
		{
			//convert string to char array
			char[] carr=s.toCharArray();
			String rev="";
			//reading reverse
			for(int i=carr.length-1;i>=0;i--)
			{
				rev+=carr[i];
			}

			if(s.equals(rev))
				System.out.println(s+" ");
		}
	}
}