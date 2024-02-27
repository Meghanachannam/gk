import java.util.Arrays;
class anagram  
{
	public static void main(String[] args) 
	{
		String str1="read";
		String str2="write";

		//convert string to array
		char[] carr1=str1.toCharArray(); 
		char[] carr2=str2.toCharArray();

		Arrays.sort(carr1); // r  e  a  d 
		Arrays.sort(carr2); // d  e  a  r

		boolean flag=true;

		//checking the letters are same or not
		for(int i=0;i<carr1.length && i<carr2.length;i++)
		{
			if(carr1[i]!=carr2[i])
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("It is Anagram String");
		else
			System.out.println("It is not Anagram String");

	}
}
