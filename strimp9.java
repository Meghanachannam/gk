 import java.util.*;
 class strimp9
 {
	 public static void main(String[] args)
	 {
		 findDuplicatesCharacters("java");
	 }
	 public static void findDuplicatesCharacters(String str)
	 {
		 LinkedHashMap<Character,Integer>lhm=new LinkedHashMap<Character,Integer>();
		 for(int i=0;i<str.length();i++)
		 {
			 char c=str.charAt(i);
			 if(lhm.get(c)!=null)
			 {
				 lhm.put(c,lhm.get(c)+1);
			 }
			 else
			 {
				 lhm.put(c,1);
			 }
		 }
		 System.out.println(lhm);
	 }
 }